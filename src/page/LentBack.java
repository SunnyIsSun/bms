/*
 * LentBack.java
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
import dao.BackDao;
import dao.StudentBookDao;
import dao.StudentDao;

/**
 *
 * @author  __USER__
 */
public class LentBack extends javax.swing.JFrame {
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;

	private int pageSize = 13;//每页显示的记录数
	private int cPageIndex = 1;//当前页
	private int totalIndex = 1;//总页数

	StudentBookDao sbd = new StudentBookDao();

	/** Creates new form BookManager */
	public LentBack() {
		initComponents();
		this.setBounds(150, 50, 1050, 650);
		//设置背景
		setBackgroudImage();
		//窗体大小不可变
		this.setResizable(false);
		searchAll();
		//设置窗体图标
		Toolkit tool = this.getToolkit(); //得到一个Toolkit对象
		Image myimage = tool.getImage("img/4.png"); //由tool获取图像
		this.setIconImage(myimage);
	}

	/**
	 *初始化页面查询所有的图书
	 */
	public void searchAll() {
		List<?> list = sbd.allBook();
		//获取表格的model
		DefaultTableModel dt = (DefaultTableModel) bookTable.getModel();
		dt.setRowCount(0);
		//给模型设置值
		for (int i = 0; i < list.size(); i++) {
			dt.addRow((Object[]) list.get(i));
		}
	}

	/** 
	 * 初始化借还服务窗体背景 
	 */
	private void setBackgroudImage() {
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("img/lentback.png"); // 添加图片  
		JLabel lb_backgroud = new JLabel(img);
		this.getLayeredPane().add(lb_backgroud, new Integer(Integer.MIN_VALUE));
		lb_backgroud.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		returnMainView = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		bno = new javax.swing.JTextField();
		query = new javax.swing.JLabel();
		bname = new javax.swing.JTextField();
		sno = new javax.swing.JTextField();
		back = new javax.swing.JLabel();
		lent = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		bookTable = new javax.swing.JTable();
		first = new javax.swing.JLabel();
		previous = new javax.swing.JLabel();
		next = new javax.swing.JLabel();
		end = new javax.swing.JLabel();
		rank = new javax.swing.JLabel();
		inputStudent = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u56fe\u4e66\u7ba1\u7406\u7cfb\u7edf>\u501f\u8fd8\u670d\u52a1");

		returnMainView.setFont(new java.awt.Font("楷体", 0, 20));
		returnMainView.setForeground(new java.awt.Color(255, 255, 255));
		returnMainView.setText("\u8fd4\u56de\u4e3b\u83dc\u5355");
		returnMainView.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				returnMainViewMouseClicked(evt);
			}
		});

		jPanel1.setOpaque(false);

		bno.setFont(new java.awt.Font("微软雅黑", 0, 16));
		bno.setBorder(null);

		query.setFont(new java.awt.Font("楷体", 0, 25));
		query.setForeground(new java.awt.Color(255, 255, 255));
		query.setText("\u67e5\u8be2");
		query.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				queryMouseClicked(evt);
			}
		});

		bname.setFont(new java.awt.Font("微软雅黑", 0, 16));
		bname.setBorder(null);

		sno.setFont(new java.awt.Font("微软雅黑", 0, 18));
		sno.setBorder(null);

		back.setFont(new java.awt.Font("楷体", 0, 25));
		back.setForeground(new java.awt.Color(255, 255, 255));
		back.setText("\u8fd8\u4e66");
		back.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				backMouseClicked(evt);
			}
		});

		lent.setFont(new java.awt.Font("楷体", 0, 25));
		lent.setForeground(new java.awt.Color(255, 255, 255));
		lent.setText("\u501f\u4e66");
		lent.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lentMouseClicked(evt);
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
																				198,
																				198,
																				198)
																		.addComponent(
																				query))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				78,
																				78,
																				78)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								bno,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								188,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								sno)
																						.addComponent(
																								bname)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				29,
																				29,
																				29)
																		.addComponent(
																				lent)
																		.addGap(
																				96,
																				96,
																				96)
																		.addComponent(
																				back)))
										.addContainerGap(40, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(60, 60, 60)
										.addComponent(
												bno,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												25,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(33, 33, 33)
										.addComponent(
												bname,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												25,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(28, 28, 28)
										.addComponent(
												sno,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(33, 33, 33)
										.addComponent(query)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												82, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lent)
														.addComponent(back))
										.addGap(56, 56, 56)));

		bookTable.setFont(new java.awt.Font("微软雅黑", 0, 14));
		bookTable
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] {

						}, new String[] { "图书编号", "图书名称", "作者", "图书类型", "是否借阅",
								"学生号" }) {
					/**
									 * 
									 */
									private static final long serialVersionUID = 1L;
					boolean[] canEdit = new boolean[] { false, false, false,
							false, false, false };

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

		first.setFont(new java.awt.Font("楷体", 0, 20));
		first.setForeground(new java.awt.Color(255, 255, 255));
		first.setText("\u9996\u9875");
		first.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				firstMouseClicked(evt);
			}
		});

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

		end.setFont(new java.awt.Font("楷体", 0, 20));
		end.setForeground(new java.awt.Color(255, 255, 255));
		end.setText("\u5c3e\u9875");
		end.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				endMouseClicked(evt);
			}
		});

		rank.setFont(new java.awt.Font("楷体", 0, 20));
		rank.setForeground(new java.awt.Color(255, 255, 255));
		rank.setText("\u501f\u9605\u6392\u884c\u699c");
		rank.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				rankMouseClicked(evt);
			}
		});

		inputStudent.setFont(new java.awt.Font("楷体", 0, 20));
		inputStudent.setForeground(new java.awt.Color(255, 255, 255));
		inputStudent.setIcon(new javax.swing.ImageIcon(
				"img\\input.png")); // NOI18N
		inputStudent.setText("\u5bfc\u5165\u5b66\u751f\u4fe1\u606f");
		inputStudent.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				inputStudentMouseClicked(evt);
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
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addGap(104, 104, 104)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				318,
																				318,
																				318)
																		.addComponent(
																				inputStudent)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				68,
																				Short.MAX_VALUE)
																		.addComponent(
																				rank)
																		.addGap(
																				76,
																				76,
																				76)
																		.addComponent(
																				returnMainView))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				1,
																				1,
																				1)
																		.addComponent(
																				jPanel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				29,
																				Short.MAX_VALUE)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createSequentialGroup()
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
																												73,
																												73,
																												73))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jScrollPane1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												512,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												10,
																												10,
																												10)))))
										.addGap(77, 77, 77)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(38, 38, 38)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																returnMainView)
														.addComponent(rank)
														.addComponent(
																inputStudent,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																64,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(98, 98, 98)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												307,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(previous)
														.addComponent(next)
														.addComponent(end)
														.addComponent(first))
										.addGap(67, 67, 67)).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(156, 156,
										156).addComponent(jPanel1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addGap(34, 34, 34)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents
	/** 
	 * 导入学生信息
	 */
	private void inputStudentMouseClicked(java.awt.event.MouseEvent evt) {
		new ImportStudent();
	}

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
		String sno = this.sno.getText();

		List<?> list = sbd.studentBook(bno, bname, sno);

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
		String sno = this.sno.getText();

		List<?> list = sbd.studentBook(bno, bname, sno);
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
		String sno = this.sno.getText();

		List<?> list = sbd.studentBook(bno, bname, sno);

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
		String sno = this.sno.getText();

		List<?> list = sbd.studentBook(bno, bname, sno);
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
	 * 借阅排行榜
	 */
	private void rankMouseClicked(java.awt.event.MouseEvent evt) {
		new Rank().setVisible(true);
		this.dispose();
		
	}

	/** 
	 * 点击归还图书 
	 */
	private void backMouseClicked(java.awt.event.MouseEvent evt) {

		//int no = this.bookTable.getSelectedRow();
		//String bno = (String) this.bookTable.getValueAt(no, 0);
		//String bname = (String) this.bookTable.getValueAt(no, 1);
		//BookModel bm = new BookModel();
		//bm.setBno(bno);
		//bm.setName(bname);
		//跳转到queryService页面
		//new Back(bm).setVisible(true);
		//跳转完关闭原来页面
		//this.dispose();

		//		String bno = this.bno.getText();
		//		String bname = this.bname.getText();
		//		String sno = this.sno.getText();
		//		BookModel book = new BookModel();
		//		book.setBno(bno);
		//		book.setName(bname);
		//判断图书编号是否重复
		//图书新增
		//bd.backBook(book, sno);
		//JOptionPane.showMessageDialog(null, "还书成功");

		BackDao bd = new BackDao();
		int[] no = this.bookTable.getSelectedRows();

		boolean b = false;
		for (int i = 0; i < no.length; i++) {
			String bno = this.bookTable.getValueAt(no[i], 0).toString();
			b = bd.backBook(bno);

		}
		if (b) {
			JOptionPane.showMessageDialog(null, "还书成功");
			List<?> list = sbd.allBook();
			/*if (list==null) {
				JOptionPane.showMessageDialog(null, "您所查询的图书不存在");
				return;
			}*/
			//获取表格的model
			DefaultTableModel dt = (DefaultTableModel) bookTable.getModel();
			dt.setRowCount(0);
			//给模型设置值
			for (int i = 0; i < list.size(); i++) {
				dt.addRow((Object[]) list.get(i));
			}

		} else {
			JOptionPane.showMessageDialog(null, "还书失败,请选择您要还的图书");
		}
	}

	/** 
	 * 点击借出图书 跳转借书页面
	 */
	private void lentMouseClicked(java.awt.event.MouseEvent evt) {
		int no = this.bookTable.getSelectedRow();
		if (no == -1) {
			JOptionPane.showMessageDialog(null, "请选择您要借的图书");
		}
		String bno = (String) this.bookTable.getValueAt(no, 0);
		String bname = (String) this.bookTable.getValueAt(no, 1);
		BookModel bm = new BookModel();
		bm.setBno(bno);
		bm.setName(bname);
		
		//跳转到queryService页面
		new Lent(bm).setVisible(true);
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

	private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {

	}

	/** 
	 *点击图书查询 
	 */
	private void queryMouseClicked(java.awt.event.MouseEvent evt) {
		// 图书查询
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String sno = this.sno.getText();

		List<?> list = sbd.studentBook(bno, bname, sno);
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
			this.sno.setText("");
		} else {
			StudentDao sd = new StudentDao();
			if (!sd.haveStu(sno) & !sno.isEmpty()) {
				JOptionPane.showMessageDialog(null, "您所查询的学生没有借阅图书");
				this.sno.setText("");
				return;
			} else {
				JOptionPane.showMessageDialog(null, "您所查询的图书不存在");
				this.bno.setText("");
				this.bname.setText("");
				this.sno.setText("");
				return;
			}
		}
		/*//获取表格的model
		DefaultTableModel dt = (DefaultTableModel) this.bookTable.getModel();
		dt.setRowCount(0);
		//给模型设置值
		for (int i = 0; i < list.size(); i++) {
			dt.addRow((Object[]) list.get(i));
		}
		this.bno.setText("");
		this.bname.setText("");
		this.sno.setText("");*/
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LentBack().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel back;
	private javax.swing.JTextField bname;
	private javax.swing.JTextField bno;
	private javax.swing.JTable bookTable;
	private javax.swing.JLabel end;
	private javax.swing.JLabel first;
	private javax.swing.JLabel inputStudent;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lent;
	private javax.swing.JLabel next;
	private javax.swing.JLabel previous;
	private javax.swing.JLabel query;
	private javax.swing.JLabel rank;
	private javax.swing.JLabel returnMainView;
	private javax.swing.JTextField sno;
	// End of variables declaration//GEN-END:variables

}