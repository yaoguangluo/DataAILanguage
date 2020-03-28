package org.tinos.language.pletl;
import java.io.File;
import java.util.HashMap;
import javax.swing.JTextPane;
import org.LYG.GUI.nodeEdit.LinkList;
import org.LYG.GUI.nodeEdit.LinkNode;
import org.LYG.GUI.nodeView.NodeShow;
import org.LYG.document.load.LoadFile;
import org.LYG.document.neroCell.BootNeroCell;
import org.LYG.sets.stable.StableData;
public class PLETLImpl implements PLETLIntef{
	@Override
	public boolean doNeroFlow(JTextPane rightBotJTextPane, NodeShow nodeView, LinkList first
			, String documentFlowAddress, HashMap<String, Object> inputMap) {
		//�ܺõĽ� ������socket plsql���ݿ⡷ �� ������ ETL������Եļ���ͼ���������ϡ�
		//�𼱣���������Ȼû��������ʶ�������Ѿ��γ���VPCS������Ԫ�ĵ��� ׶�Ρ�20200322 ������ 
		try {
			String fileCurrentpath= documentFlowAddress;
			File file= new File(fileCurrentpath);
			if(!file.isFile()) {
				System.out.println(StableData.ATTENSION_RECHOICE);
				return false;
			}
			LinkNode needDeleteNode= first.first;
			while(needDeleteNode!= null) {
				first.first= first.deletNode(first.first, needDeleteNode.name
						, needDeleteNode.ID, needDeleteNode.primaryKey);
				if(null== needDeleteNode.next) {
					break;
				}
				needDeleteNode= needDeleteNode.next;
			}
			first.first= LoadFile.Load(first.first, nodeView, file, first);
			BootNeroCell.bootCell(first.first, rightBotJTextPane);
		} catch(Exception loadE) {
			loadE.printStackTrace();
		}
		return true;
	}
	//�����
}