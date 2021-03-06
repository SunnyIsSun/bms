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
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;

	StudentBookDao sbd = new StudentBookDao();

	/** Creates new form Rank */
	public Rank() {
		initComponents();
		this.setBounds(150, 50, 1050, 650);
		//设置背景
		setBackgroudImage();
		//窗体大小不可变
		this.setResizable(false);
		rank();
		//设置窗体图标
		Toolkit tool = this.getToolkit(); //得到一个Toolkit对象
		Image myimage = tool.getImage("img/4.png"); //由tool获取图像
		this.setIconImage(myimage);
	}

	public void rank() {
		List<?> list = sbd.rank();
		//获取表格的model
		DefaultTableModel dt = (DefaultTableModel) rank.getModel();
		dt.setRowCount(0);
		//给模型设置值
		for (int i = 0; i < list.size(); i++) {
			dt.addRow((Object[]) list.get(i));
		}
	}

	/** 
	 * 初始化排行榜窗体背景 
	 */
	private void setBackgroudImage() {
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("img/rank.jpg"); // 添加图片  
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

		rank.setFont(new java.awt.Font("微软雅黑", 0, 14));
		rank.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "学号", "姓名", "借阅总数" }) {
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

		back.setFont(new java.awt.Font("楷体", 0, 20));
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
	 * 返回借还服务页面
	 */
	private void backMouseClicked(java.awt.event.MouseEvent evt) {
		//跳转到queryService页面
		new LentBack().setVisible(true);
		//跳转完关闭原来页面
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