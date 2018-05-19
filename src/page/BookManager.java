/*
 * BookManager.java
 *
 * Created on __DATE__, __TIME__
 */

package page;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import model.BookModel;
import dao.BookDeleteDao;
import dao.BookQueryDao;

/**
 *
 * @author  __USER__
 */
public class BookManager extends javax.swing.JFrame {
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;

	private int pageSize = 13;//每页显示的记录数
	private int cPageIndex = 1;//当前页
	private int totalIndex = 1;//总页数

	BookDeleteDao bdd = new BookDeleteDao();

	BookQueryDao bqd = new BookQueryDao();

	/** Creates new form BookManager */
	public BookManager() {
		initComponents();
		this.setBounds(150, 50, 1050, 650);
		//设置背景
		setBackgroudImage();
		//窗体大小不可变
		this.setResizable(false);
		searchAll();
		
		//设置窗体图标
		Toolkit tool = this.getToolkit(); //得到一个Toolkit对象
		Image myimage = tool.getImage("img/3.png"); //由tool获取图像
		this.setIconImage(myimage);
	}

	/**
	 *初始化界面查询所有图书
	 */
	public void searchAll() {
		List<?> list = bqd.queryAllBook();
		//获取表格的model
		DefaultTableModel dt = (DefaultTableModel) bookTable.getModel();
		dt.setRowCount(0);
		//给模型设置值
		for (int i = 0; i < list.size(); i++) {
			dt.addRow((Object[]) list.get(i));
		}
	}

	/** 
	 * 初始化图书管理页面窗体背景 
	 */
	private void setBackgroudImage() {
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("img/bookmanager.png"); // 添加图片  
		JLabel lb_backgroud = new JLabel(img);
		this.getLayeredPane().add(lb_backgroud, new Integer(Integer.MIN_VALUE));
		lb_backgroud.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		bname = new javax.swing.JTextField();
		query = new javax.swing.JLabel();
		bookAdd = new javax.swing.JLabel();
		bookDelete = new javax.swing.JLabel();
		btype = new javax.swing.JComboBox();
		bno = new javax.swing.JTextField();
		bauthor = new javax.swing.JTextField();
		bookUpdate = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		bookTable = new javax.swing.JTable();
		previous = new javax.swing.JLabel();
		next = new javax.swing.JLabel();
		returnMainView = new javax.swing.JLabel();
		first = new javax.swing.JLabel();
		end = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u56fe\u4e66\u7ba1\u7406\u7cfb\u7edf>\u56fe\u4e66\u7ba1\u7406");

		jPanel1.setOpaque(false);

		bname.setFont(new java.awt.Font("微软雅黑", 0, 16));
		bname.setBorder(null);

		query.setFont(new java.awt.Font("楷体", 0, 25));
		query.setForeground(new java.awt.Color(255, 255, 255));
		query.setText("\u67e5\u8be2");
		query.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				queryMouseClicked(evt);
			}
		});

		bookAdd.setFont(new java.awt.Font("楷体", 0, 25));
		bookAdd.setForeground(new java.awt.Color(255, 255, 255));
		bookAdd.setText("\u589e\u52a0");
		bookAdd.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bookAddMouseClicked(evt);
			}
		});

		bookDelete.setFont(new java.awt.Font("楷体", 0, 25));
		bookDelete.setForeground(new java.awt.Color(255, 255, 255));
		bookDelete.setText("\u5220\u9664");
		bookDelete.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bookDeleteMouseClicked(evt);
			}
		});

		btype.setFont(new java.awt.Font("微软雅黑", 0, 16));
		btype.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"请选择", "科幻", "散文", "哲学", "古装", "自然", "科学", "物理", "故事" }));

		bno.setFont(new java.awt.Font("微软雅黑", 0, 16));
		bno.setBorder(null);

		bauthor.setFont(new java.awt.Font("微软雅黑", 0, 16));
		bauthor.setBorder(null);

		bookUpdate.setFont(new java.awt.Font("楷体", 0, 25));
		bookUpdate.setForeground(new java.awt.Color(255, 255, 255));
		bookUpdate.setText("\u4fee\u6539");
		bookUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bookUpdateMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				106,
																				106,
																				106)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								btype,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								149,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel1Layout
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
																												196,
																												Short.MAX_VALUE))))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				44,
																				44,
																				44)
																		.addComponent(
																				bookAdd)
																		.addGap(
																				49,
																				49,
																				49)
																		.addComponent(
																				bookUpdate)
																		.addGap(
																				49,
																				49,
																				49)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								query)
																						.addComponent(
																								bookDelete))))
										.addContainerGap(42, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												bno,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												25,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												bname,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												25,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												bauthor,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(26, 26, 26)
										.addComponent(
												btype,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												23,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(35, 35, 35)
										.addComponent(
												query,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												30,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												64, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(bookAdd)
														.addComponent(
																bookUpdate)
														.addComponent(
																bookDelete))
										.addGap(32, 32, 32)));

		jPanel2.setOpaque(false);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 96,
				Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 35,
				Short.MAX_VALUE));

		bookTable.setFont(new java.awt.Font("微软雅黑", 0, 14));
		bookTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "图书编号", "图书名称", "作者", "图书类型", "是否借阅" }) {
			/**
					 * 
					 */
					private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		bookTable.setOpaque(false);
		bookTable.setRequestFocusEnabled(false);
		bookTable.setRowHeight(22);
		bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bookTableMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(bookTable);

		previous.setFont(new java.awt.Font("楷体", 0, 20));
		previous.setForeground(new java.awt.Color(255, 255, 255));
		previous.setText("\u4e0a\u4e00\u9875");
		previous.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				previousMouseClicked(evt);
			}
		});

		next.setFont(new java.awt.Font("楷体", 0, 20));
		next.setForeground(new java.awt.Color(255, 255, 255));
		next.setText("\u4e0b\u4e00\u9875");
		next.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				nextMouseClicked(evt);
			}
		});

		returnMainView.setFont(new java.awt.Font("楷体", 0, 20));
		returnMainView.setForeground(new java.awt.Color(255, 255, 255));
		returnMainView.setText("\u8fd4\u56de\u4e3b\u83dc\u5355");
		returnMainView.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				returnMainViewMouseClicked(evt);
			}
		});

		first.setFont(new java.awt.Font("楷体", 0, 20));
		first.setForeground(new java.awt.Color(255, 255, 255));
		first.setText("\u9996\u9875");
		first.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				firstMouseClicked(evt);
			}
		});

		end.setFont(new java.awt.Font("楷体", 0, 20));
		end.setForeground(new java.awt.Color(255, 255, 255));
		end.setText("\u5c3e\u9875");
		end.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				endMouseClicked(evt);
			}
		});

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
										.addGap(54, 54, 54)
										.addComponent(
												jPanel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				25,
																				25,
																				25)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												92,
																												92,
																												92)
																										.addComponent(
																												first)
																										.addGap(
																												61,
																												61,
																												61)
																										.addComponent(
																												previous)
																										.addGap(
																												70,
																												70,
																												70)
																										.addComponent(
																												next)
																										.addGap(
																												60,
																												60,
																												60)
																										.addComponent(
																												end)
																										.addGap(
																												996,
																												996,
																												996)
																										.addComponent(
																												jPanel2,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												458,
																												458,
																												458)
																										.addComponent(
																												returnMainView)
																										.addContainerGap())))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				54,
																				54,
																				54)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				512,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap()))));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jPanel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				40,
																				40,
																				40)
																		.addComponent(
																				returnMainView)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												486,
																												486,
																												486)
																										.addComponent(
																												jPanel2,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jScrollPane1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												305,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												18,
																												18,
																												18)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																previous)
																														.addComponent(
																																next)
																														.addComponent(
																																end)
																														.addComponent(
																																first))
																										.addGap(
																												9,
																												9,
																												9)))))
										.addGap(64, 64, 64)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	public void fillModel(List<?> list) {
		//获取表格的model
		DefaultTableModel dt = (DefaultTableModel) this.bookTable.getModel();
		dt.setRowCount(0);//清空列表
		int start = (cPageIndex - 1) * pageSize;
		int end = cPageIndex * pageSize - 1;
		//判断高位下标是否大于总记录数
		if (end > list.size() - 1) {
			end = list.size() - 1;
		}
		//给模型设置值
		for (int i = start; i <= end; i++) {
			dt.addRow((Object[]) list.get(i));
		}

	}

	/** 
	 * 首页
	 */
	private void firstMouseClicked(java.awt.event.MouseEvent evt) {
		// 图书查询
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		List<?> list = bqd.queryBook(bno, bname, bauthor, btype);

		//获取表格的model
		DefaultTableModel dt = (DefaultTableModel) this.bookTable.getModel();
		dt.setRowCount(0);//清空列表
		//判断高位下标是否大于总记录数
		int end = 12;
		if (list.size() - 1 < pageSize) {
			end = list.size() - 1;
		}
		//给模型设置值
		for (int i = 0; i <= end; i++) {
			dt.addRow((Object[]) list.get(i));
		}
	}

	/** 
	 * 最后一页
	 */
	private void endMouseClicked(java.awt.event.MouseEvent evt) {
		// 图书查询
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		List<?> list = bqd.queryBook(bno, bname, bauthor, btype);
		int totalSize = list.size();
		//总页数
		totalIndex = totalSize % pageSize == 0 ? totalSize / pageSize
				: totalSize / pageSize + 1;

		//获取表格的model
		DefaultTableModel dt = (DefaultTableModel) this.bookTable.getModel();
		dt.setRowCount(0);//清空列表
		int start = (totalIndex - 1) * pageSize;

		//给模型设置值
		for (int i = start; i <= list.size() - 1; i++) {
			dt.addRow((Object[]) list.get(i));
		}
	}

	/** 
	 * 上一页
	 */
	private void previousMouseClicked(java.awt.event.MouseEvent evt) {
		// 图书查询
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		List<?> list = bqd.queryBook(bno, bname, bauthor, btype);

		cPageIndex--;//当前页自减1
		if (cPageIndex < 1) {
			cPageIndex = 1;
			return;
		}

		fillModel(list);
	}

	/** 
	 * 下一页
	 */
	private void nextMouseClicked(java.awt.event.MouseEvent evt) {
		// 图书查询
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		List<?> list = bqd.queryBook(bno, bname, bauthor, btype);
		int totalSize = list.size();
		//总页数
		totalIndex = totalSize % pageSize == 0 ? totalSize / pageSize
				: totalSize / pageSize + 1;
		cPageIndex++;//当前页自加1
		if (cPageIndex > totalIndex) {
			cPageIndex = totalIndex;
			return;
		}
		fillModel(list);
	}

	/** 
	 * 点击删除图书
	 */
	private void bookDeleteMouseClicked(java.awt.event.MouseEvent evt) {
		//int no = this.bookTable.getSelectedRow();
		int[] no = this.bookTable.getSelectedRows();

		boolean b = false;
		for (int i = 0; i < no.length; i++) {
			String bno = this.bookTable.getValueAt(no[i], 0).toString();
			b = bdd.deleteBook(bno);

		}
		if (b) {
			JOptionPane.showMessageDialog(null, "删除成功");
			List<?> list = bqd.queryAllBook();
			if (list == null) {
				JOptionPane.showMessageDialog(null, "您所查询的图书不存在");
				return;
			}
			//获取表格的model
			DefaultTableModel dt = (DefaultTableModel) bookTable.getModel();
			dt.setRowCount(0);
			//给模型设置值
			for (int i = 0; i < list.size(); i++) {
				dt.addRow((Object[]) list.get(i));
			}

		} else {
			JOptionPane.showMessageDialog(null, "请选择您要删除的图书(注:已借阅的书不可以删除)");
		}
	}

	private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {

	}

	/** 
	 * 点击增加图书
	 */
	private void bookAddMouseClicked(java.awt.event.MouseEvent evt) {
		//跳转到queryService页面
		new BookAdd().setVisible(true);
		//跳转完关闭原来页面
		this.dispose();
	}

	/** 
	 * 点击修改图书 
	 */
	private void bookUpdateMouseClicked(java.awt.event.MouseEvent evt) {

		int no = this.bookTable.getSelectedRow();
		if (no == -1) {
			JOptionPane.showMessageDialog(null, "请选择要修改的图书");
			return;
		}
		String bno = (String) this.bookTable.getValueAt(no, 0);
		String bname = (String) this.bookTable.getValueAt(no, 1);
		String bauthor = (String) this.bookTable.getValueAt(no, 2);
		String btype = (String) this.bookTable.getValueAt(no, 3);
		BookModel bm = new BookModel();
		bm.setBno(bno);
		bm.setName(bname);
		bm.setAuthor(bauthor);
		bm.setTname(btype);
		//跳转到queryService页面
		new BookUpdate(bm).setVisible(true);
		//跳转完关闭原来页面
		this.dispose();
	}

	/** 
	 * 点击返回主界面
	 */
	private void returnMainViewMouseClicked(java.awt.event.MouseEvent evt) {
		//跳转到queryService页面
		new MainView().setVisible(true);
		//跳转完关闭原来页面
		this.dispose();
	}

	/** 
	 * 点击查询图书
	 */
	private void queryMouseClicked(java.awt.event.MouseEvent evt) {
		// 图书查询
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		List<?> list = bqd.queryBook(bno, bname, bauthor, btype);
		if (!list.isEmpty()) {
			//获取表格的model
			DefaultTableModel dt = (DefaultTableModel) this.bookTable
					.getModel();
			dt.setRowCount(0);
			//给模型设置值
			for (int i = 0; i < list.size(); i++) {
				dt.addRow((Object[]) list.get(i));
			}
			this.bno.setText("");
			this.bname.setText("");
			this.bauthor.setText("");
		} else {

			JOptionPane.showMessageDialog(null, "您所查询的图书不存在");
			this.bno.setText("");
			this.bname.setText("");
			this.bauthor.setText("");
			return;
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BookManager().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTextField bauthor;
	private javax.swing.JTextField bname;
	private javax.swing.JTextField bno;
	private javax.swing.JLabel bookAdd;
	private javax.swing.JLabel bookDelete;
	private javax.swing.JTable bookTable;
	private javax.swing.JLabel bookUpdate;
	private javax.swing.JComboBox btype;
	private javax.swing.JLabel end;
	private javax.swing.JLabel first;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel next;
	private javax.swing.JLabel previous;
	private javax.swing.JLabel query;
	private javax.swing.JLabel returnMainView;
	// End of variables declaration//GEN-END:variables

}