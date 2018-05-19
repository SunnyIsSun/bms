/*
 * BookUpdate.java
 *
 * Created on __DATE__, __TIME__
 */

package page;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.BookModel;
import dao.BookUpdateDao;

/**
 *
 * @author  __USER__
 */
public class BookUpdate extends javax.swing.JFrame {
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;

	BookModel bookModel;

	/** Creates new form BookUpdate */
	public BookUpdate() {
		initComponents();
		this.setBounds(150, 50, 1050, 650);
		//设置背景
		setBackgroudImage();
		//窗体大小不可变
		this.setResizable(false);
		//设置窗体图标
		Toolkit tool = this.getToolkit(); //得到一个Toolkit对象
		Image myimage = tool.getImage("img/3.png"); //由tool获取图像
		this.setIconImage(myimage);

	}

	/** Creates new form BookUpdate构造方法 */
	public BookUpdate(BookModel bookModel) {
		this.bookModel = bookModel;
		initComponents();
		this.setBounds(150, 50, 1050, 650);
		//设置背景
		setBackgroudImage();
		//窗体大小不可变
		this.setResizable(false);

		this.bno.setText(bookModel.getBno());
		this.bname.setText(bookModel.getName());
		this.bauthor.setText(bookModel.getAuthor());
		this.btype.setSelectedItem(bookModel.getTname());
	}

	/** 
	 * 初始化图书修改窗体背景 
	 */
	private void setBackgroudImage() {
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("img/bookupdate.jpg"); // 添加图片  
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

		bno = new javax.swing.JTextField();
		bname = new javax.swing.JTextField();
		bauthor = new javax.swing.JTextField();
		submit = new javax.swing.JLabel();
		btype = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u56fe\u4e66\u7ba1\u7406\u7cfb\u7edf>\u56fe\u4e66\u7ba1\u7406>\u56fe\u4e66\u4fee\u6539");

		bno.setEditable(false);
		bno.setFont(new java.awt.Font("微软雅黑", 0, 18));
		bno.setBorder(null);

		bname.setFont(new java.awt.Font("微软雅黑", 0, 18));
		bname.setBorder(null);

		bauthor.setFont(new java.awt.Font("微软雅黑", 0, 18));
		bauthor.setBorder(null);

		submit.setFont(new java.awt.Font("楷体", 0, 30));
		submit.setForeground(new java.awt.Color(255, 255, 255));
		submit.setText("\u63d0\u4ea4");
		submit.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				submitMouseClicked(evt);
			}
		});

		btype.setFont(new java.awt.Font("微软雅黑", 0, 16));
		btype.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"请选择", "科幻", "散文", "哲学", "古装", "自然", "科学", "物理", "故事" }));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(273, 273, 273)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																btype,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																187,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				bauthor,
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				bname,
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				bno,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				244,
																				Short.MAX_VALUE)))
										.addContainerGap(551, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										517, Short.MAX_VALUE).addComponent(
										submit).addGap(491, 491, 491)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(200, 200, 200)
						.addComponent(bno,
								javax.swing.GroupLayout.PREFERRED_SIZE, 31,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								33, 33, 33).addComponent(bname,
								javax.swing.GroupLayout.PREFERRED_SIZE, 31,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								28, 28, 28).addComponent(bauthor,
								javax.swing.GroupLayout.PREFERRED_SIZE, 31,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								36, 36, 36).addComponent(btype,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								49, 49, 49).addComponent(submit)
						.addContainerGap(148, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 *提交图书修改
	 */
	private void submitMouseClicked(java.awt.event.MouseEvent evt) {
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		BookModel book = new BookModel();
		book.setBno(bno);
		book.setName(bname);
		book.setAuthor(bauthor);
		book.setTname(btype);
		book.setLent("否");
		//判断图书编号是否重复
		//图书新增
		BookUpdateDao bud = new BookUpdateDao();
		bud.updateBook(book);

		JOptionPane.showMessageDialog(null, "修改成功");
		//跳转到queryService页面
		new BookManager().setVisible(true);
		//跳转完关闭原来页面
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BookUpdate().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTextField bauthor;
	private javax.swing.JTextField bname;
	private javax.swing.JTextField bno;
	private javax.swing.JComboBox btype;
	private javax.swing.JLabel submit;
	// End of variables declaration//GEN-END:variables

}