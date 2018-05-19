/*
 * Rank.java
 *
 * Created on __DATE__, __TIME__
 */

package page;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import dao.StudentBookDao;

/**
 *
 * @author  __USER__
 */
public class Rank extends javax.swing.JFrame {
	/**
	 * ���к�
	 */
	private static final long serialVersionUID = 1L;

	StudentBookDao sbd = new StudentBookDao();

	/** Creates new form Rank */
	public Rank() {
		initComponents();
		this.setBounds(150, 50, 1050, 650);
		//���ñ���
		setBackgroudImage();
		//�����С���ɱ�
		this.setResizable(false);
		rank();
		//���ô���ͼ��
		Toolkit tool = this.getToolkit(); //�õ�һ��Toolkit����
		Image myimage = tool.getImage("img/4.png"); //��tool��ȡͼ��
		this.setIconImage(myimage);
	}

	public void rank() {
		List<?> list = sbd.rank();
		//��ȡ�����model
		DefaultTableModel dt = (DefaultTableModel) rank.getModel();
		dt.setRowCount(0);
		//��ģ������ֵ
		for (int i = 0; i < list.size(); i++) {
			dt.addRow((Object[]) list.get(i));
		}
	}

	/** 
	 * ��ʼ�����а��屳�� 
	 */
	private void setBackgroudImage() {
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("img/rank.jpg"); // ����ͼƬ  
		JLabel lb_backgroud = new JLabel(img);
		this.getLayeredPane().add(lb_backgroud, new Integer(Integer.MIN_VALUE));
		lb_backgroud.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		rank = new javax.swing.JTable();
		back = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u56fe\u4e66\u7ba1\u7406\u7cfb\u7edf>\u501f\u8fd8\u670d\u52a1>\u501f\u9605\u6392\u884c\u699c");

		rank.setFont(new java.awt.Font("΢���ź�", 0, 14));
		rank.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "ѧ��", "����", "��������" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean[] { false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		rank.setOpaque(false);
		rank.setRowHeight(22);
		jScrollPane1.setViewportView(rank);

		back.setFont(new java.awt.Font("����", 0, 20));
		back.setForeground(new java.awt.Color(255, 255, 255));
		back.setText("\u8fd4\u56de\u4e0a\u4e00\u7ea7");
		back.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				backMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(625,
						Short.MAX_VALUE).addComponent(back).addGap(66, 66, 66))
				.addGroup(
						layout.createSequentialGroup().addGap(192, 192, 192)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										252,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(347, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(33, 33, 33).addComponent(
						back).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.RELATED,
						113, Short.MAX_VALUE).addComponent(jScrollPane1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 310,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(106,
						106, 106)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * ���ؽ軹����ҳ��
	 */
	private void backMouseClicked(java.awt.event.MouseEvent evt) {
		//��ת��queryServiceҳ��
		new LentBack().setVisible(true);
		//��ת��ر�ԭ��ҳ��
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Rank().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel back;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable rank;
	// End of variables declaration//GEN-END:variables

}