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
	 * ���к�
	 */
	private static final long serialVersionUID = 1L;

	private int pageSize = 13;//ÿҳ��ʾ�ļ�¼��
	private int cPageIndex = 1;//��ǰҳ
	private int totalIndex = 1;//��ҳ��

	BookDeleteDao bdd = new BookDeleteDao();

	BookQueryDao bqd = new BookQueryDao();

	/** Creates new form BookManager */
	public BookManager() {
		initComponents();
		this.setBounds(150, 50, 1050, 650);
		//���ñ���
		setBackgroudImage();
		//�����С���ɱ�
		this.setResizable(false);
		searchAll();
		
		//���ô���ͼ��
		Toolkit tool = this.getToolkit(); //�õ�һ��Toolkit����
		Image myimage = tool.getImage("img/3.png"); //��tool��ȡͼ��
		this.setIconImage(myimage);
	}

	/**
	 *��ʼ�������ѯ����ͼ��
	 */
	public void searchAll() {
		List<?> list = bqd.queryAllBook();
		//��ȡ����model
		DefaultTableModel dt = (DefaultTableModel) bookTable.getModel();
		dt.setRowCount(0);
		//��ģ������ֵ
		for (int i = 0; i < list.size(); i++) {
			dt.addRow((Object[]) list.get(i));
		}
	}

	/** 
	 * ��ʼ��ͼ�����ҳ�洰�屳�� 
	 */
	private void setBackgroudImage() {
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("img/bookmanager.png"); // ���ͼƬ  
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

		bname.setFont(new java.awt.Font("΢���ź�", 0, 16));
		bname.setBorder(null);

		query.setFont(new java.awt.Font("����", 0, 25));
		query.setForeground(new java.awt.Color(255, 255, 255));
		query.setText("\u67e5\u8be2");
		query.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				queryMouseClicked(evt);
			}
		});

		bookAdd.setFont(new java.awt.Font("����", 0, 25));
		bookAdd.setForeground(new java.awt.Color(255, 255, 255));
		bookAdd.setText("\u589e\u52a0");
		bookAdd.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bookAddMouseClicked(evt);
			}
		});

		bookDelete.setFont(new java.awt.Font("����", 0, 25));
		bookDelete.setForeground(new java.awt.Color(255, 255, 255));
		bookDelete.setText("\u5220\u9664");
		bookDelete.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bookDeleteMouseClicked(evt);
			}
		});

		btype.setFont(new java.awt.Font("΢���ź�", 0, 16));
		btype.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"��ѡ��", "�ƻ�", "ɢ��", "��ѧ", "��װ", "��Ȼ", "��ѧ", "����", "����" }));

		bno.setFont(new java.awt.Font("΢���ź�", 0, 16));
		bno.setBorder(null);

		bauthor.setFont(new java.awt.Font("΢���ź�", 0, 16));
		bauthor.setBorder(null);

		bookUpdate.setFont(new java.awt.Font("����", 0, 25));
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

		bookTable.setFont(new java.awt.Font("΢���ź�", 0, 14));
		bookTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "ͼ����", "ͼ������", "����", "ͼ������", "�Ƿ����" }) {
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

		returnMainView.setFont(new java.awt.Font("����", 0, 20));
		returnMainView.setForeground(new java.awt.Color(255, 255, 255));
		returnMainView.setText("\u8fd4\u56de\u4e3b\u83dc\u5355");
		returnMainView.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				returnMainViewMouseClicked(evt);
			}
		});

		first.setFont(new java.awt.Font("����", 0, 20));
		first.setForeground(new java.awt.Color(255, 255, 255));
		first.setText("\u9996\u9875");
		first.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				firstMouseClicked(evt);
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
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		List<?> list = bqd.queryBook(bno, bname, bauthor, btype);

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
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		List<?> list = bqd.queryBook(bno, bname, bauthor, btype);
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
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		List<?> list = bqd.queryBook(bno, bname, bauthor, btype);

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
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		List<?> list = bqd.queryBook(bno, bname, bauthor, btype);
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
	 * ���ɾ��ͼ��
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
			JOptionPane.showMessageDialog(null, "ɾ���ɹ�");
			List<?> list = bqd.queryAllBook();
			if (list == null) {
				JOptionPane.showMessageDialog(null, "������ѯ��ͼ�鲻����");
				return;
			}
			//��ȡ����model
			DefaultTableModel dt = (DefaultTableModel) bookTable.getModel();
			dt.setRowCount(0);
			//��ģ������ֵ
			for (int i = 0; i < list.size(); i++) {
				dt.addRow((Object[]) list.get(i));
			}

		} else {
			JOptionPane.showMessageDialog(null, "��ѡ����Ҫɾ����ͼ��(ע:�ѽ��ĵ��鲻����ɾ��)");
		}
	}

	private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {

	}

	/** 
	 * �������ͼ��
	 */
	private void bookAddMouseClicked(java.awt.event.MouseEvent evt) {
		//��ת��queryServiceҳ��
		new BookAdd().setVisible(true);
		//��ת��ر�ԭ��ҳ��
		this.dispose();
	}

	/** 
	 * ����޸�ͼ�� 
	 */
	private void bookUpdateMouseClicked(java.awt.event.MouseEvent evt) {

		int no = this.bookTable.getSelectedRow();
		if (no == -1) {
			JOptionPane.showMessageDialog(null, "��ѡ��Ҫ�޸ĵ�ͼ��");
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
		//��ת��queryServiceҳ��
		new BookUpdate(bm).setVisible(true);
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

	/** 
	 * �����ѯͼ��
	 */
	private void queryMouseClicked(java.awt.event.MouseEvent evt) {
		// ͼ���ѯ
		String bno = this.bno.getText();
		String bname = this.bname.getText();
		String bauthor = this.bauthor.getText();
		String btype = this.btype.getSelectedItem().toString();
		List<?> list = bqd.queryBook(bno, bname, bauthor, btype);
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
			this.bauthor.setText("");
		} else {

			JOptionPane.showMessageDialog(null, "������ѯ��ͼ�鲻����");
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