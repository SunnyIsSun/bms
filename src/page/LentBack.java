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
	 * ���к�
	 */
	private static final long serialVersionUID = 1L;

	private int pageSize = 13;//ÿҳ��ʾ�ļ�¼��
	private int cPageIndex = 1;//��ǰҳ
	private int totalIndex = 1;//��ҳ��

	StudentBookDao sbd = new StudentBookDao();

	/** Creates new form BookManager */
	public LentBack() {
		initComponents();
		this.setBounds(150, 50, 1050, 650);
		//���ñ���
		setBackgroudImage();
		//�����С���ɱ�
		this.setResizable(false);
		searchAll();
		//���ô���ͼ��
		Toolkit tool = this.getToolkit(); //�õ�һ��Toolkit����
		Image myimage = tool.getImage("img/4.png"); //��tool��ȡͼ��
		this.setIconImage(myimage);
	}

	/**
	 *��ʼ��ҳ���ѯ���е�ͼ��
	 */
	public void searchAll() {
		List<?> list = sbd.allBook();
		//��ȡ����model
		DefaultTableModel dt = (DefaultTableModel) bookTable.getModel();
		dt.setRowCount(0);
		//��ģ������ֵ
		for (int i = 0; i < list.size(); i++) {
			dt.addRow((Object[]) list.get(i));
		}
	}

	/** 
	 * ��ʼ���軹�����屳�� 
	 */
	private void setBackgroudImage() {
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("img/lentback.png"); // ���ͼƬ  
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

		returnMainView.setFont(new java.awt.Font("����", 0, 20));
		returnMainView.setForeground(new java.awt.Color(255, 255, 255));
		returnMainView.setText("\u8fd4\u56de\u4e3b\u83dc\u5355");
		returnMainView.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				returnMainViewMouseClicked(evt);
			}
		});

		jPanel1.setOpaque(false);

		bno.setFont(new java.awt.Font("΢���ź�", 0, 16));
		bno.setBorder(null);

		query.setFont(new java.awt.Font("����", 0, 25));
		query.setForeground(new java.awt.Color(255, 255, 255));
		query.setText("\u67e5\u8be2");
		query.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				queryMouseClicked(evt);
			}
		});

		bname.setFont(new java.awt.Font("΢���ź�", 0, 16));
		bname.setBorder(null);

		sno.setFont(new java.awt.Font("΢���ź�", 0, 18));
		sno.setBorder(null);

		back.setFont(new java.awt.Font("����", 0, 25));
		back.setForeground(new java.awt.Color(255, 255, 255));
		back.setText("\u8fd8\u4e66");
		back.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				backMouseClicked(evt);
			}
		});

		lent.setFont(new java.awt.Font("����", 0, 25));
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

		bookTable.setFont(new java.awt.Font("΢���ź�", 0, 14));
		bookTable
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] {

						}, new String[] { "ͼ����", "ͼ������", "����", "ͼ������", "�Ƿ����",
								"ѧ����" }) {
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

		first.setFont(new java.awt.Font("����", 0, 20));
		first.setForeground(new java.awt.Color(255, 255, 255));
		first.setText("\u9996\u9875");
		first.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				firstMouseClicked(evt);
			}
		});

		previous.setFont(new java.awt.Font("����", 0, 20));
		previous.setForeground(new java.awt.Color(255, 255, 255));
		previous.setText("\u4e0a\u4e00\u9875");
		previous.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				previousMouseClicked(evt);
			}
		});

		next.setFont(new java.awt.Font("����", 0, 20));
		next.setForeground(new java.awt.Color(255, 255, 255));
		next.setText("\u4e0b\u4e00\u9875");
		next.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				nextMouseClicked(evt);
			}
		});

		end.setFont(new java.awt.Font("����", 0, 20));
		end.setForeground(new java.awt.Color(255, 255, 255));
		end.setText("\u5c3e\u9875");
		end.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				endMouseClicked(evt);
			}
		});

		rank.setFont(new java.awt.Font("����", 0, 20));
		rank.setForeground(new java.awt.Color(255, 255, 255));
		rank.setText("\u501f\u9605\u6392\u884c\u699c");
		rank.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				rankMouseClicked(evt);
			}
		});

		inputStudent.setFont(new java.awt.Font("����", 0, 20));
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
	 * ����ѧ����Ϣ
	 */
	private void inputStudentMouseClicked(java.awt.event.MouseEvent evt) {
		new ImportStudent();
	}

	public void fillModel(List<?> list) {
		//��ȡ����model
		DefaultTableModel dt = (DefaultTableModel) this.bookTable.getModel();
		dt.setRowCount(0);//����б�
		int start = (cPageIndex - 1) * pageSize;
		int end = cPageIndex * pageSize - 1;
		//�жϸ�λ�±��Ƿ�����ܼ�¼��
		if (end > list.size() - 1) {
			end = list.size() - 1;
		}
		//��ģ������ֵ
		for (int i = start; i <= end; i++) {
			dt.addRow((Object[]) list.get(i));
		}

	}

	/** 
	 * ��ҳ
	 */
	private void firstMouseClicked(java.awt.event.MouseEvent evt) {
		// ͼ���ѯ
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String sno = this.sno.getText();

		List<?> list = sbd.studentBook(bno, bname, sno);

		//��ȡ����model
		DefaultTableModel dt = (DefaultTableModel) this.bookTable.getModel();
		dt.setRowCount(0);//����б�
		//�жϸ�λ�±��Ƿ�����ܼ�¼��
		int end = 12;
		if (list.size() - 1 < pageSize) {
			end = list.size() - 1;
		}
		//��ģ������ֵ
		for (int i = 0; i <= end; i++) {
			dt.addRow((Object[]) list.get(i));
		}
	}

	/** 
	 * ���һҳ
	 */
	private void endMouseClicked(java.awt.event.MouseEvent evt) {
		// ͼ���ѯ
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String sno = this.sno.getText();

		List<?> list = sbd.studentBook(bno, bname, sno);
		int totalSize = list.size();
		//��ҳ��
		totalIndex = totalSize % pageSize == 0 ? totalSize / pageSize
				: totalSize / pageSize + 1;

		//��ȡ����model
		DefaultTableModel dt = (DefaultTableModel) this.bookTable.getModel();
		dt.setRowCount(0);//����б�
		int start = (totalIndex - 1) * pageSize;

		//��ģ������ֵ
		for (int i = start; i <= list.size() - 1; i++) {
			dt.addRow((Object[]) list.get(i));
		}
	}

	/** 
	 * ��һҳ
	 */
	private void previousMouseClicked(java.awt.event.MouseEvent evt) {
		// ͼ���ѯ
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String sno = this.sno.getText();

		List<?> list = sbd.studentBook(bno, bname, sno);

		cPageIndex--;//��ǰҳ�Լ�1
		if (cPageIndex < 1) {
			cPageIndex = 1;
			return;
		}

		fillModel(list);
	}

	/** 
	 * ��һҳ
	 */
	private void nextMouseClicked(java.awt.event.MouseEvent evt) {
		// ͼ���ѯ
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String sno = this.sno.getText();

		List<?> list = sbd.studentBook(bno, bname, sno);
		int totalSize = list.size();
		//��ҳ��
		totalIndex = totalSize % pageSize == 0 ? totalSize / pageSize
				: totalSize / pageSize + 1;
		cPageIndex++;//��ǰҳ�Լ�1
		if (cPageIndex > totalIndex) {
			cPageIndex = totalIndex;
			return;
		}
		fillModel(list);
	}
	/** 
	 * �������а�
	 */
	private void rankMouseClicked(java.awt.event.MouseEvent evt) {
		new Rank().setVisible(true);
		this.dispose();
		
	}

	/** 
	 * ����黹ͼ�� 
	 */
	private void backMouseClicked(java.awt.event.MouseEvent evt) {

		//int no = this.bookTable.getSelectedRow();
		//String bno = (String) this.bookTable.getValueAt(no, 0);
		//String bname = (String) this.bookTable.getValueAt(no, 1);
		//BookModel bm = new BookModel();
		//bm.setBno(bno);
		//bm.setName(bname);
		//��ת��queryServiceҳ��
		//new Back(bm).setVisible(true);
		//��ת��ر�ԭ��ҳ��
		//this.dispose();

		//		String bno = this.bno.getText();
		//		String bname = this.bname.getText();
		//		String sno = this.sno.getText();
		//		BookModel book = new BookModel();
		//		book.setBno(bno);
		//		book.setName(bname);
		//�ж�ͼ�����Ƿ��ظ�
		//ͼ������
		//bd.backBook(book, sno);
		//JOptionPane.showMessageDialog(null, "����ɹ�");

		BackDao bd = new BackDao();
		int[] no = this.bookTable.getSelectedRows();

		boolean b = false;
		for (int i = 0; i < no.length; i++) {
			String bno = this.bookTable.getValueAt(no[i], 0).toString();
			b = bd.backBook(bno);

		}
		if (b) {
			JOptionPane.showMessageDialog(null, "����ɹ�");
			List<?> list = sbd.allBook();
			/*if (list==null) {
				JOptionPane.showMessageDialog(null, "������ѯ��ͼ�鲻����");
				return;
			}*/
			//��ȡ����model
			DefaultTableModel dt = (DefaultTableModel) bookTable.getModel();
			dt.setRowCount(0);
			//��ģ������ֵ
			for (int i = 0; i < list.size(); i++) {
				dt.addRow((Object[]) list.get(i));
			}

		} else {
			JOptionPane.showMessageDialog(null, "����ʧ��,��ѡ����Ҫ����ͼ��");
		}
	}

	/** 
	 * ������ͼ�� ��ת����ҳ��
	 */
	private void lentMouseClicked(java.awt.event.MouseEvent evt) {
		int no = this.bookTable.getSelectedRow();
		if (no == -1) {
			JOptionPane.showMessageDialog(null, "��ѡ����Ҫ���ͼ��");
		}
		String bno = (String) this.bookTable.getValueAt(no, 0);
		String bname = (String) this.bookTable.getValueAt(no, 1);
		BookModel bm = new BookModel();
		bm.setBno(bno);
		bm.setName(bname);
		
		//��ת��queryServiceҳ��
		new Lent(bm).setVisible(true);
		//��ת��ر�ԭ��ҳ��
		this.dispose();
	}

	/** 
	 * ������������� 
	 */
	private void returnMainViewMouseClicked(java.awt.event.MouseEvent evt) {
		//��ת��queryServiceҳ��
		new MainView().setVisible(true);
		//��ת��ر�ԭ��ҳ��
		this.dispose();
	}

	private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {

	}

	/** 
	 *���ͼ���ѯ 
	 */
	private void queryMouseClicked(java.awt.event.MouseEvent evt) {
		// ͼ���ѯ
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String sno = this.sno.getText();

		List<?> list = sbd.studentBook(bno, bname, sno);
		if (!list.isEmpty()) {
			//��ȡ����model
			DefaultTableModel dt = (DefaultTableModel) this.bookTable
					.getModel();
			dt.setRowCount(0);
			//��ģ������ֵ
			for (int i = 0; i < list.size(); i++) {
				dt.addRow((Object[]) list.get(i));
			}
			this.bno.setText("");
			this.bname.setText("");
			this.sno.setText("");
		} else {
			StudentDao sd = new StudentDao();
			if (!sd.haveStu(sno) & !sno.isEmpty()) {
				JOptionPane.showMessageDialog(null, "������ѯ��ѧ��û�н���ͼ��");
				this.sno.setText("");
				return;
			} else {
				JOptionPane.showMessageDialog(null, "������ѯ��ͼ�鲻����");
				this.bno.setText("");
				this.bname.setText("");
				this.sno.setText("");
				return;
			}
		}
		/*//��ȡ����model
		DefaultTableModel dt = (DefaultTableModel) this.bookTable.getModel();
		dt.setRowCount(0);
		//��ģ������ֵ
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