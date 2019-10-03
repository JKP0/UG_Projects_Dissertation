package gUiTCSlv.gUiTCSlv;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;


public class TCSmnfm {

	private JFrame frmTcsmnfm;
	public static int N, n, n0, n1, n2;
	public static int b, k, j, i;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TCSmnfm window = new TCSmnfm();
					window.frmTcsmnfm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TCSmnfm()throws IOException {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException {
		frmTcsmnfm = new JFrame();
		frmTcsmnfm.setFont(new Font("Edwardian Script ITC", Font.BOLD | Font.ITALIC, 26));
		frmTcsmnfm.setVisible(true);
	    frmTcsmnfm.setResizable(false);
		frmTcsmnfm.setForeground(new Color(0, 128, 128));
		frmTcsmnfm.setTitle("TCSMn");
		frmTcsmnfm.getContentPane().setForeground(new Color(0, 139, 139));
		frmTcsmnfm.getContentPane().setBackground(new Color(51, 255, 255));
		frmTcsmnfm.setBackground(new Color(0, 128, 128));
		frmTcsmnfm.setBounds(220, 30, 900, 680);
		frmTcsmnfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTcsmnfm.getContentPane().setLayout(null);
		

		JLabel lblLabel_hdr = new JLabel("WELCOME TO TCS LAB");
		lblLabel_hdr.setBackground(new Color(64, 224, 208));
		lblLabel_hdr.setFont(new Font("Script MT Bold", Font.BOLD | Font.ITALIC, 60));
		lblLabel_hdr.setForeground(new Color(255, 0, 0));
		lblLabel_hdr.setBounds(85, 30, 715, 70);
		frmTcsmnfm.getContentPane().add(lblLabel_hdr);
		
		
		
		JPanel panel_mnHm = new JPanel();
		panel_mnHm.setBackground(Color.CYAN);
		panel_mnHm.setVisible(true);
		panel_mnHm.setBounds(0, 170, 900, 520);
		frmTcsmnfm.getContentPane().add(panel_mnHm);
		panel_mnHm.setLayout(null);
		
		JTextPane txtpn_Mn0 = new JTextPane();
		txtpn_Mn0.setEditable(false);
		txtpn_Mn0.setFont(new Font("Shonar Bangla", Font.BOLD | Font.ITALIC, 30));
		txtpn_Mn0.setForeground(new Color(51, 255, 255));
		txtpn_Mn0.setBackground(new Color(255, 0, 204));
		txtpn_Mn0.setText("                              We WELCOME You To TCS Lab...\r\n                                     Making easy is not EASE!\r\n                                     Making soft is not SOFT!");
		txtpn_Mn0.setBounds(50, 0, 790, 130);
		panel_mnHm.add(txtpn_Mn0);
		
		JTextPane txtpn_Mn1 = new JTextPane();
		txtpn_Mn1.setEditable(false);
		txtpn_Mn1.setFont(new Font("Microsoft Himalaya", Font.BOLD | Font.ITALIC, 26));
		txtpn_Mn1.setForeground(new Color(0, 0, 255));
		txtpn_Mn1.setBackground(new Color(0, 255, 255));
		txtpn_Mn1.setText("           Here we can write input for back-end program manually or we can also select\r\n                      auto generated random input, And we can analyse the  output.\r\n\r\n. Destination never makes a condition to reach via a specific path; Rather it tells that we have to make zero to a sufficient distance.\r\n. And Path never tells that come in pair; But it tells that come and move :: Actively, Creatively,  and be Careful while moving, Because I am not only for you & I am busy so much.\r\n. Always doubt on your mind is that extracting exactly whatever infront of you; Because not_good / impossible does not comes first, it enters first to your mind due to your past activity . \r\n                                        ...So Always Be Doubtful On Your Mind....\r\n                                                         Be Careful Be Helpful...  ");
		txtpn_Mn1.setBounds(50, 130, 790, 340);
		panel_mnHm.add(txtpn_Mn1);  
		
		JPanel panel_HmAb = new JPanel();
		panel_HmAb.setBackground(new Color(0, 255, 255));
		panel_HmAb.setVisible(false);
		panel_HmAb.setBounds(0, 170, 900, 480);
		frmTcsmnfm.getContentPane().add(panel_HmAb);
		panel_HmAb.setLayout(null);
		
		JLabel lblLabel_Ab0 = new JLabel("About...");
		lblLabel_Ab0.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel_Ab0.setForeground(new Color(255, 0, 255));
		lblLabel_Ab0.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 36));
		lblLabel_Ab0.setBackground(new Color(0, 204, 255));
		lblLabel_Ab0.setBounds(180, 0, 200, 30);
		panel_HmAb.add(lblLabel_Ab0);
		
		JLabel lblLabel_Ab1 = new JLabel("IMGAchab");
		lblLabel_Ab1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img_Ab = new ImageIcon(this.getClass().getResource("/pic.jpg")).getImage();
		lblLabel_Ab1.setIcon(new ImageIcon(img_Ab));
		lblLabel_Ab1.setBounds(60, 40,200, 220);
		panel_HmAb.add(lblLabel_Ab1);
		
		JScrollPane scrollPane_Ab = new JScrollPane();
		scrollPane_Ab.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_Ab.setBounds(260, 40, 600, 420);
		panel_HmAb.add(scrollPane_Ab);
		
		JTextArea txtrArea_Ab = new JTextArea();
		txtrArea_Ab.setWrapStyleWord(true);
		txtrArea_Ab.setEditable(false);
		txtrArea_Ab.setLineWrap(true);
		txtrArea_Ab.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		txtrArea_Ab.setForeground(new Color(255, 153, 153));
		txtrArea_Ab.setBackground(Color.BLUE);
		FileReader Ab_MsgFile = new FileReader("StaticFile//abs.txt");
		BufferedReader Ab_rEader = new BufferedReader(Ab_MsgFile);
		txtrArea_Ab.read(Ab_rEader, null);
		Ab_rEader.close();
		scrollPane_Ab.setViewportView(txtrArea_Ab);
		
		
		
		JPanel panel_AdSS = new JPanel();
		panel_AdSS.setBackground(new Color(0, 255, 255));
		panel_AdSS.setVisible(false);
		panel_AdSS.setBounds(0, 170, 900, 480);
		frmTcsmnfm.getContentPane().add(panel_AdSS);
		panel_AdSS.setLayout(null);
		
		JLabel lblLabel_SS0 = new JLabel("Message From Guide Dr. Sudhakar Sahoo");
		lblLabel_SS0.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel_SS0.setForeground(new Color(255, 0, 255));
		lblLabel_SS0.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 26));
		lblLabel_SS0.setBackground(new Color(0, 204, 255));
		lblLabel_SS0.setBounds(180, 0, 500, 30);
		panel_AdSS.add(lblLabel_SS0);
		
        JLabel lblLabel_SS1 = new JLabel("");
        lblLabel_SS1.setHorizontalAlignment(SwingConstants.CENTER);
        Image img_SS = new ImageIcon(this.getClass().getResource("/ss.jpg")).getImage();
		lblLabel_SS1.setIcon(new ImageIcon(img_SS));
        lblLabel_SS1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel_SS1.setBounds(60, 40,200, 220);
		panel_AdSS.add(lblLabel_SS1);
		
		JScrollPane scrollPane_SS = new JScrollPane();
		scrollPane_SS.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_SS.setBounds(260, 40, 600, 410);
		panel_AdSS.add(scrollPane_SS);
		
		JTextArea txtrArea_SS = new JTextArea();
		txtrArea_SS.setEditable(false);
		txtrArea_SS.setLineWrap(true);
		txtrArea_SS.setWrapStyleWord(true);
		txtrArea_SS.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 33));
		txtrArea_SS.setForeground(new Color(255, 0, 0));
		txtrArea_SS.setBackground(new Color(0, 255, 127));
		FileReader SS_MsgFile = new FileReader("StaticFile//ss.txt");
		BufferedReader SS_rEader = new BufferedReader(SS_MsgFile);
		txtrArea_SS.read(SS_rEader, null);
		SS_rEader.close();
		scrollPane_SS.setViewportView(txtrArea_SS);
		
		
		
		
		JPanel panel_AdMH = new JPanel();
		panel_AdMH.setBackground(new Color(0, 255, 255));
		panel_AdMH.setVisible(false);
		panel_AdMH.setBounds(0, 170, 900, 480);
		frmTcsmnfm.getContentPane().add(panel_AdMH);
		panel_AdMH.setLayout(null);
		
		
		JLabel lblLabel_MH0 = new JLabel("Message From Guide Shree Manmay Hota");
		lblLabel_MH0.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel_MH0.setForeground(new Color(255, 0, 255));
		lblLabel_MH0.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 26));
		lblLabel_MH0.setBackground(new Color(0, 204, 255));
		lblLabel_MH0.setBounds(180, 0, 500, 30);
		panel_AdMH.add(lblLabel_MH0);
		
        JLabel lblLabel_MH1 = new JLabel("");
        lblLabel_MH1.setHorizontalAlignment(SwingConstants.CENTER);
        Image img_MH = new ImageIcon(this.getClass().getResource("/IMG_20180418_150051.jpg")).getImage();
		lblLabel_MH1.setIcon(new ImageIcon(img_MH));
        lblLabel_MH1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel_MH1.setBounds(60, 40,200, 220);
		panel_AdMH.add(lblLabel_MH1);
		
		JScrollPane scrollPane_MH = new JScrollPane();
		scrollPane_MH.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_MH.setBounds(260, 40, 600, 420);
		panel_AdMH.add(scrollPane_MH);
		
		JTextArea txtrArea_MH = new JTextArea();
		txtrArea_MH.setEditable(false);
		txtrArea_MH.setWrapStyleWord(true);
		txtrArea_MH.setLineWrap(true);
		txtrArea_MH.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 33));
		txtrArea_MH.setForeground(new Color(255, 0, 0));
		txtrArea_MH.setBackground(new Color(0, 255, 127));
		FileReader MH_MsgFile = new FileReader("StaticFile//mh.txt");
		BufferedReader MH_rEader = new BufferedReader(MH_MsgFile);
		txtrArea_MH.read(MH_rEader, null);
		MH_rEader.close();
		scrollPane_MH.setViewportView(txtrArea_MH);
		
		
		
		JPanel panel_AdSD = new JPanel();
		panel_AdSD.setBackground(new Color(0, 255, 255));
		panel_AdSD.setVisible(false);
		panel_AdSD.setBounds(0, 170, 900, 480);
		frmTcsmnfm.getContentPane().add(panel_AdSD);
		panel_AdSD.setLayout(null);
		
		
		JLabel lblLabel_SD0 = new JLabel("Experience From Back End Programer Susovan Das");
		lblLabel_SD0.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel_SD0.setForeground(new Color(255, 0, 255));
		lblLabel_SD0.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 26));
		lblLabel_SD0.setBackground(new Color(0, 204, 255));
		lblLabel_SD0.setBounds(120, 0, 600, 30);
		panel_AdSD.add(lblLabel_SD0);
		
        JLabel lblLabel_SD1 = new JLabel("");
        lblLabel_SD1.setHorizontalAlignment(SwingConstants.CENTER);
        Image img_SD = new ImageIcon(this.getClass().getResource("/ii.jpg")).getImage();
		lblLabel_SD1.setIcon(new ImageIcon(img_SD));
        lblLabel_SD1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel_SD1.setBounds(60, 40,200, 220);
		panel_AdSD.add(lblLabel_SD1);
		
		JScrollPane scrollPane_SD = new JScrollPane();
		scrollPane_SD.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_SD.setBounds(260, 40, 600, 410);
		panel_AdSD.add(scrollPane_SD);
		
		JTextArea txtrArea_SD = new JTextArea();
		txtrArea_SD.setLineWrap(true);
		txtrArea_SD.setWrapStyleWord(true);
		txtrArea_SD.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
		txtrArea_SD.setForeground(new Color(0, 0, 255));
		txtrArea_SD.setBackground(new Color(250, 250, 210));
		FileReader SD_MsgFile = new FileReader("StaticFile//SD.txt");
		BufferedReader SD_rEader = new BufferedReader(SD_MsgFile);
		txtrArea_SD.read(SD_rEader, null);
		SD_rEader.close();
		scrollPane_SD.setViewportView(txtrArea_SD);
		
		
		
		JPanel panel_AdJK = new JPanel();
		panel_AdJK.setBackground(new Color(0, 255, 255));
		panel_AdJK.setVisible(false);
		panel_AdJK.setBounds(0, 170, 900, 480);
		frmTcsmnfm.getContentPane().add(panel_AdJK);
		panel_AdJK.setLayout(null);
		
		
		JLabel lblLabel_JK0 = new JLabel("Experience From Front End Designer & Devloper Jeetu Kumar");
		lblLabel_JK0.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel_JK0.setForeground(new Color(255, 0, 255));
		lblLabel_JK0.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 26));
		lblLabel_JK0.setBackground(new Color(0, 204, 255));
		lblLabel_JK0.setBounds(100, 0, 700, 30);
		panel_AdJK.add(lblLabel_JK0);
		
        JLabel lblLabel_JK1 = new JLabel("");
        lblLabel_JK1.setHorizontalAlignment(SwingConstants.CENTER);
        Image img_JK = new ImageIcon(this.getClass().getResource("/jkpp.jpg")).getImage();
		lblLabel_JK1.setIcon(new ImageIcon(img_JK));
        lblLabel_JK1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel_JK1.setBounds(60, 40,200, 220);
		panel_AdJK.add(lblLabel_JK1);
		
		JScrollPane scrollPane_Jk = new JScrollPane();
		scrollPane_Jk.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_Jk.setBounds(260, 40, 600, 410);
		panel_AdJK.add(scrollPane_Jk);
		
		JTextArea txtrArea_JK = new JTextArea();
		txtrArea_JK.setLineWrap(true);
		txtrArea_JK.setWrapStyleWord(true);
		txtrArea_JK.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		txtrArea_JK.setForeground(new Color(178, 34, 34));
		txtrArea_JK.setBackground(new Color(0, 255, 0));
		FileReader JK_MsgFile = new FileReader("StaticFile//JKP.txt");
		BufferedReader JK_rEader = new BufferedReader(JK_MsgFile);
		txtrArea_JK.read(JK_rEader, null);
		JK_rEader.close();
		scrollPane_Jk.setViewportView(txtrArea_JK);
		
		
		
		JPanel panel_Intro = new JPanel();
		panel_Intro.setBackground(new Color(0, 255, 255));
		panel_Intro.setVisible(false);
		panel_Intro.setBounds(0, 170, 900, 480);
		frmTcsmnfm.getContentPane().add(panel_Intro);
		panel_Intro.setLayout(null);
		
		
		JLabel lblLabel_Int0 = new JLabel("Introduction To The Subject...");
		lblLabel_Int0.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel_Int0.setForeground(new Color(255, 0, 255));
		lblLabel_Int0.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 26));
		lblLabel_Int0.setBackground(new Color(0, 204, 255));
		lblLabel_Int0.setBounds(160, 0, 400, 30);
		panel_Intro.add(lblLabel_Int0);
		
        JLabel lblLabel_Int1 = new JLabel();
		lblLabel_Int1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img_Int = new ImageIcon(this.getClass().getResource("/img3.jpg")).getImage();
		lblLabel_Int1.setIcon(new ImageIcon(img_Int));
		lblLabel_Int1.setBounds(60, 40,200, 220);
		panel_Intro.add(lblLabel_Int1);
		
		JLabel lblLabel_Int2 = new JLabel();
		lblLabel_Int2.setHorizontalAlignment(SwingConstants.CENTER);
		Image img_Int1 = new ImageIcon(this.getClass().getResource("/img1.jpg")).getImage();
		lblLabel_Int2.setIcon(new ImageIcon(img_Int1));
		lblLabel_Int2.setBounds(60, 260,200, 220);
		panel_Intro.add(lblLabel_Int2);
		
		JScrollPane scrollPane_Int = new JScrollPane();
		scrollPane_Int.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_Int.setBounds(260, 40, 600, 420);
		panel_Intro.add(scrollPane_Int);
		
		JTextArea txtrArea_Int = new JTextArea();
		txtrArea_Int.setWrapStyleWord(true);
		txtrArea_Int.setEditable(false);
		txtrArea_Int.setLineWrap(true);
		txtrArea_Int.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		txtrArea_Int.setForeground(new Color(255, 0, 255));
		txtrArea_Int.setBackground(new Color(255, 235, 205));
		FileReader Int_MsgFile = new FileReader("StaticFile//intro.txt");
		BufferedReader Int_rEader = new BufferedReader(Int_MsgFile);
		txtrArea_Int.read(Int_rEader, null);
		Int_rEader.close();
		scrollPane_Int.setViewportView(txtrArea_Int);
		
		
		JPanel panel_We = new JPanel();
		panel_We.setToolTipText("");
		panel_We.setBackground(new Color(0, 255, 255));
		panel_We.setVisible(false);
		panel_We.setBounds(0, 170, 900, 480);
		frmTcsmnfm.getContentPane().add(panel_We);
		panel_We.setLayout(null);
		
		JTextPane txtpnThisSiteIs = new JTextPane();
		txtpnThisSiteIs.setEditable(false);
		txtpnThisSiteIs.setText("This site is under construction...");
		txtpnThisSiteIs.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtpnThisSiteIs.setForeground(Color.WHITE);
		txtpnThisSiteIs.setBackground(Color.BLACK);
		txtpnThisSiteIs.setBounds(140, 100, 600, 100);
		panel_We.add(txtpnThisSiteIs);
		
		JPanel panel_fn = new JPanel();
		panel_fn.setBackground(new Color(0, 255, 255));
		panel_fn.setBounds(0, 130, 900, 40);
		frmTcsmnfm.getContentPane().add(panel_fn);
		panel_fn.setLayout(null);
		
		JPanel panel_PrpgmP0 = new JPanel();
		panel_PrpgmP0.setBackground(new Color(0, 255, 255));
		panel_PrpgmP0.setVisible(false);
		panel_PrpgmP0.setBounds(0, 170, 900, 480);
		frmTcsmnfm.getContentPane().add(panel_PrpgmP0);
		panel_PrpgmP0.setLayout(null);
		
		
		JLabel lblLabel_P0 = new JLabel("SIMULATION OF DETERMINISTIC FINITE AUTOMATA");
		lblLabel_P0.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel_P0.setForeground(new Color(255, 0, 255));
		lblLabel_P0.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 26));
		lblLabel_P0.setBackground(new Color(0, 204, 255));
		lblLabel_P0.setBounds(110, 0, 640, 30);
		panel_PrpgmP0.add(lblLabel_P0);
		
		JLabel lblLabel_P01 = new JLabel();
		lblLabel_P01.setHorizontalAlignment(SwingConstants.CENTER);
		Image img_P0I = new ImageIcon(this.getClass().getResource("/img4.jpg")).getImage();
		lblLabel_P01.setIcon(new ImageIcon(img_P0I));
		lblLabel_P01.setBounds(60, 40,200, 220);
		panel_PrpgmP0.add(lblLabel_P01);
		
		JLabel lblLabel_P02 = new JLabel();
		lblLabel_P02.setHorizontalAlignment(SwingConstants.CENTER);
		Image img_P0I1 = new ImageIcon(this.getClass().getResource("/img2.jpg")).getImage();
		lblLabel_P02.setIcon(new ImageIcon(img_P0I1));
		lblLabel_P02.setBounds(60, 260,200, 220);
		panel_PrpgmP0.add(lblLabel_P02);
		
		JPanel panel_P0In = new JPanel();
		panel_P0In.setForeground(Color.WHITE);
		panel_P0In.setBackground(Color.CYAN);
		panel_P0In.setBounds(260, 50, 580, 400);
		panel_PrpgmP0.add(panel_P0In);
		panel_P0In.setLayout(null);
		
		
		JPanel panel_P0Out = new JPanel();
		panel_P0Out.setForeground(Color.WHITE);
		panel_P0Out.setBackground(Color.CYAN);
		panel_P0Out.setVisible(false);
		panel_P0Out.setBounds(260, 50, 580, 400);
		panel_PrpgmP0.add(panel_P0Out);
		panel_P0Out.setLayout(null);
		
		JScrollPane scrollPane_InsP0 = new JScrollPane();
		scrollPane_InsP0.setVisible(false);
		scrollPane_InsP0.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_InsP0.setBounds(0, 45, 580, 355);
		panel_P0In.add(scrollPane_InsP0);
		
		JTextArea txtAr_InsP0 = new JTextArea();
		txtAr_InsP0.setEditable(false);
		txtAr_InsP0.setLineWrap(true);
		txtAr_InsP0.setWrapStyleWord(true);
		txtAr_InsP0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		FileReader Ins_IO = new FileReader("StaticFile//IOIntructions.txt");
		BufferedReader Ins_rEader = new BufferedReader(Ins_IO);
		txtAr_InsP0.read(Ins_rEader, null);
		Ins_rEader.close();
		txtAr_InsP0.setForeground(Color.MAGENTA);
		txtAr_InsP0.setBackground(new Color(0, 255, 255));
		scrollPane_InsP0.setViewportView(txtAr_InsP0);
		
		JPanel panel_p0Sm = new JPanel();
		panel_p0Sm.setForeground(new Color(240, 248, 255));
		panel_p0Sm.setBackground(Color.BLUE);
		panel_p0Sm.setVisible(false);
		panel_p0Sm.setBounds(40, 50, 340, 180);
		panel_P0In.add(panel_p0Sm);
		panel_p0Sm.setLayout(null);
		
		JLabel lbLabel_InpMt = new JLabel("Select Input Method");
		lbLabel_InpMt.setHorizontalAlignment(SwingConstants.CENTER);
		lbLabel_InpMt.setForeground(Color.YELLOW);
		lbLabel_InpMt.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lbLabel_InpMt.setBounds(40, 10, 240, 30);
		panel_p0Sm.add(lbLabel_InpMt);
		
		JRadioButton rdbtn_Maly = new JRadioButton("   Manually");
		rdbtn_Maly.setForeground(new Color(255, 0, 0));
		rdbtn_Maly.setFont(new Font("Tahoma", Font.ITALIC, 22));
		rdbtn_Maly.setBounds(80, 50, 160, 30);
		panel_p0Sm.add(rdbtn_Maly);
		
		JRadioButton rdbtn_AtG = new JRadioButton(" Auto-Generated");
		rdbtn_AtG.setForeground(new Color(255, 0, 0));
		rdbtn_AtG.setFont(new Font("Tahoma", Font.ITALIC, 18));
		rdbtn_AtG.setBounds(80, 90, 160, 30);
		panel_p0Sm.add(rdbtn_AtG);
		
		ButtonGroup btngInpMthd = new ButtonGroup();
		btngInpMthd.add(rdbtn_Maly);
		btngInpMthd.add(rdbtn_AtG);
		
		JButton btnNGo = new JButton("GO");
		btnNGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eGo) {
				if(rdbtn_Maly.isSelected()) {
					 panel_fn.setVisible(false);
					 panel_mnHm.setVisible(false);
					 panel_HmAb.setVisible(false);
					 panel_AdSS.setVisible(false);
					 panel_AdMH.setVisible(false);
					 panel_AdSD.setVisible(false);
					 panel_AdJK.setVisible(false);
					 panel_Intro.setVisible(false);
					 panel_PrpgmP0.setVisible(false);
					 panel_We.setVisible(false);
					   try {
				       InptP0MuL(panel_fn, panel_PrpgmP0, panel_P0In, panel_P0Out );
					   }catch(IOException eIp) {
						   eIp.printStackTrace();
						   JOptionPane.showMessageDialog(null, "###M Sorry For Interrupt.\n Something Went Wrong.");
						   
					   }
					
				}
				
               if(rdbtn_AtG.isSelected()) {
            	   
				   try {
				     InptP0Aut( panel_P0In, panel_P0Out);
				   }catch(IOException eIp) {
						eIp.printStackTrace();
						JOptionPane.showMessageDialog(null, "###A Sorry For Interrupt.\n Something Went Wrong.");
						   
					 }
					
				   panel_mnHm.setVisible(false);
  				   panel_HmAb.setVisible(false);
  				   panel_AdSS.setVisible(false);
  				   panel_AdMH.setVisible(false);
  				   panel_AdSD.setVisible(false);
  				   panel_AdJK.setVisible(false);
  				   panel_Intro.setVisible(false);
  				   panel_We.setVisible(false);
  				   panel_PrpgmP0.setVisible(true);
  				 
					
				}

			}
		});
		btnNGo.setForeground(new Color(255, 20, 147));
		btnNGo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		btnNGo.setBounds(120, 130, 70, 30);
		panel_p0Sm.add(btnNGo); 
		
		
		JPanel panel_p0 = new JPanel();
		panel_p0.setForeground(new Color(240, 248, 255));
		panel_p0.setBackground(new Color(0, 191, 255));
		panel_p0.setBounds(60, 10, 300, 30);
		panel_P0In.add(panel_p0);
		panel_p0.setLayout(null);
		
		JButton btnButton_InsP0 = new JButton("Instruction");
		btnButton_InsP0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eInsP0) {
				scrollPane_InsP0.setVisible(true);
				
			}
		});
		btnButton_InsP0.setHorizontalAlignment(SwingConstants.LEFT);
		btnButton_InsP0.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 24));
		btnButton_InsP0.setForeground(new Color(0, 191, 255));
		btnButton_InsP0.setBackground(new Color(250, 250, 210));
		btnButton_InsP0.setBounds(0, 0, 170, 30);
		panel_p0.add(btnButton_InsP0);
		
		JButton btnButton_InpP0 = new JButton("Input");
		btnButton_InpP0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eInpP0) {
				 panel_mnHm.setVisible(false);
				 panel_HmAb.setVisible(false);
				 panel_AdSS.setVisible(false);
				 panel_AdMH.setVisible(false);
				 panel_AdSD.setVisible(false);
				 panel_AdJK.setVisible(false);
				 panel_Intro.setVisible(false);
				 panel_We.setVisible(false);
				 scrollPane_InsP0.setVisible(false);
				 panel_PrpgmP0.setVisible(true);
				 panel_p0Sm.setVisible(true);
				 
				 
				
			}
		});
		btnButton_InpP0.setBackground(new Color(245, 245, 220));
		btnButton_InpP0.setForeground(new Color(0, 191, 255));
		btnButton_InpP0.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 24));
		btnButton_InpP0.setBounds(170, 0, 130, 30);
		panel_p0.add(btnButton_InpP0);
		
		

        JScrollPane scrollPane_OutP0 = new JScrollPane();
        scrollPane_OutP0.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane_OutP0.setVisible(false);
		scrollPane_OutP0.setBounds(0, 45, 580, 355);
		panel_P0Out.add(scrollPane_OutP0);
		
		JTextArea txtrArea_OutP0 = new JTextArea();
		txtrArea_OutP0.setWrapStyleWord(true);
		txtrArea_OutP0.setLineWrap(true);
		txtrArea_OutP0.setEditable(false);
		txtrArea_OutP0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtrArea_OutP0.setForeground(new Color(0, 0, 205));
		txtrArea_OutP0.setBackground(new Color(0, 255, 255));
		scrollPane_OutP0.setViewportView(txtrArea_OutP0);
		
		JPanel panel_OutP0 = new JPanel();
		panel_OutP0.setForeground(new Color(240, 248, 255));
		panel_OutP0.setBackground(new Color(127, 255, 212));
		panel_OutP0.setBounds(0, 0, 580, 30);
		panel_P0Out.add(panel_OutP0);
		panel_OutP0.setLayout(null);
		
		JButton btnOutP0R = new JButton("See Recent OutPut");
		btnOutP0R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eOuR) {
				try {
				FileReader Out_File = new FileReader("Programs\\DFA_SIM\\Read_Write\\Output_O\\OutO.txt");
				BufferedReader Out_rEader = new BufferedReader(Out_File);
				txtrArea_OutP0.read(Out_rEader, null);
				Out_rEader.close();	
				}catch(IOException eOutR) {
					JOptionPane.showMessageDialog(null, "$$Out$ Sorry For Interrupt.\n Something Went Wrong.");
					eOutR.printStackTrace();	
				}
				scrollPane_OutP0.setVisible(true);
				
				
			}
		});
		btnOutP0R.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOutP0R.setForeground(new Color(0, 0, 255));
		btnOutP0R.setVerticalAlignment(SwingConstants.TOP);
		btnOutP0R.setBounds(0, 0, 190, 30);
		panel_OutP0.add(btnOutP0R);
		
		JButton btnOutP0S = new JButton("See All Recent OutPut ");
		btnOutP0S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eOual) {
				try {
					FileReader Out_File = new FileReader("Programs\\DFA_SIM\\Read_Write\\Output_A\\OutA.txt");
					BufferedReader Out_rEader = new BufferedReader(Out_File);
					txtrArea_OutP0.read(Out_rEader, null);
					Out_rEader.close();	
					}catch(IOException eOutA) {
						JOptionPane.showMessageDialog(null, "$$Out$ Sorry For Interrupt.\n Something Went Wrong.");
						eOutA.printStackTrace();	
					}
					scrollPane_OutP0.setVisible(true);
						
			}
		});
		btnOutP0S.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOutP0S.setForeground(new Color(0, 0, 255));
		btnOutP0S.setVerticalAlignment(SwingConstants.TOP);
		btnOutP0S.setBounds(205, 0, 220, 30);
		panel_OutP0.add(btnOutP0S);
		
		JButton btnOutP0B = new JButton("NEXT/BACK");
		btnOutP0B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel_mnHm.setVisible(false);
				panel_HmAb.setVisible(false);
				panel_AdSS.setVisible(false);
				panel_AdMH.setVisible(false);
				panel_AdSD.setVisible(false);
				panel_AdJK.setVisible(false);
				panel_Intro.setVisible(false);
				panel_We.setVisible(false);
				panel_P0Out.setVisible(false);
				scrollPane_OutP0.setVisible(false);
				panel_P0In.setVisible(true);
				panel_PrpgmP0.setVisible(true);
			}
		});
		btnOutP0B.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOutP0B.setForeground(new Color(0, 0, 139));
		btnOutP0B.setVerticalAlignment(SwingConstants.TOP);
		btnOutP0B.setBounds(440, 0, 140, 30);
		panel_OutP0.add(btnOutP0B);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(1, 1, 1, 1));
		menuBar.setForeground(new Color(255, 0, 204));
		menuBar.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 26));
		menuBar.setBackground(new Color(0, 204, 255));
		menuBar.setBounds(120, 0, 630, 30);
		panel_fn.add(menuBar);
		
		JMenu mnMenu_Hm = new JMenu("Home");
		mnMenu_Hm.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_Hm.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 26));
		mnMenu_Hm.setForeground(new Color(0, 0, 255));
		mnMenu_Hm.setBackground(new Color(0, 204, 153));
		menuBar.add(mnMenu_Hm);
		
		
		JSeparator separator_Hm = new JSeparator();
		separator_Hm.setOrientation(SwingConstants.VERTICAL);
		separator_Hm.setForeground(Color.BLACK);
		separator_Hm.setBackground(Color.CYAN);
		menuBar.add(separator_Hm);
		
		JMenuItem mntmMenuItem_hm = new JMenuItem("Home");
		mntmMenuItem_hm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eH) {
				  panel_HmAb.setVisible(false);
				  panel_AdSS.setVisible(false);
				  panel_AdMH.setVisible(false);
				  panel_AdSD.setVisible(false);
				  panel_AdJK.setVisible(false);
				  panel_Intro.setVisible(false);
				  panel_PrpgmP0.setVisible(false);
				  panel_We.setVisible(false);
				  panel_mnHm.setVisible(true);
				  
			}
		});
		mntmMenuItem_hm.setHorizontalAlignment(SwingConstants.CENTER);
		mntmMenuItem_hm.setForeground(new Color(0, 0, 255));
		mntmMenuItem_hm.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_hm.setBackground(new Color(255, 255, 224));
		mnMenu_Hm.add(mntmMenuItem_hm);
		
		JMenuItem mntmMenuItem_Ab = new JMenuItem("About");
		mntmMenuItem_Ab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eAb) {
				  panel_mnHm.setVisible(false);
				  panel_AdSS.setVisible(false);
				  panel_AdMH.setVisible(false);
				  panel_AdSD.setVisible(false);
				  panel_AdJK.setVisible(false);
				  panel_Intro.setVisible(false);
				  panel_PrpgmP0.setVisible(false);
				  panel_We.setVisible(false);
				  panel_HmAb.setVisible(true);
				  
			}
		});
		mntmMenuItem_Ab.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_Ab.setForeground(new Color(0, 0, 255));
		mntmMenuItem_Ab.setBackground(new Color(255, 248, 220));
		mntmMenuItem_Ab.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_Hm.add(mntmMenuItem_Ab);
		
		JMenu mnMenu_Adm = new JMenu("Administration");
		mnMenu_Adm.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_Adm.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 26));
		mnMenu_Adm.setForeground(new Color(0, 0, 255));
		mnMenu_Adm.setBackground(new Color(0, 204, 153));
		menuBar.add(mnMenu_Adm);
		
		JMenuItem mntmMenuItem_AdmSS = new JMenuItem("Dr. Sudhakar Sahoo");
		mntmMenuItem_AdmSS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eSS) {
				  panel_mnHm.setVisible(false);
				  panel_HmAb.setVisible(false);
				  panel_AdMH.setVisible(false);
				  panel_AdSD.setVisible(false);
				  panel_AdJK.setVisible(false);
				  panel_Intro.setVisible(false);
				  panel_PrpgmP0.setVisible(false);
				  panel_We.setVisible(false);
				  panel_AdSS.setVisible(true);
				  
			}
		});
		mntmMenuItem_AdmSS.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_AdmSS.setForeground(new Color(0, 0, 255));
		mntmMenuItem_AdmSS.setBackground(new Color(152, 251, 152));
		mntmMenuItem_AdmSS.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_Adm.add(mntmMenuItem_AdmSS);
		
		JMenuItem mntmMenuItem_AdmMH = new JMenuItem("Shree Manmay Hota");
		mntmMenuItem_AdmMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eMH) {
				  panel_mnHm.setVisible(false);
				  panel_HmAb.setVisible(false);
				  panel_AdSS.setVisible(false);
				  panel_AdSD.setVisible(false);
				  panel_AdJK.setVisible(false);
				  panel_Intro.setVisible(false);
				  panel_PrpgmP0.setVisible(false);
				  panel_We.setVisible(false);
				  panel_AdMH.setVisible(true);
				  
			}
		});
		mntmMenuItem_AdmMH.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_AdmMH.setForeground(new Color(0, 0, 255));
		mntmMenuItem_AdmMH.setBackground(new Color(152, 251, 152));
		mntmMenuItem_AdmMH.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_Adm.add(mntmMenuItem_AdmMH);
		
		JSeparator separator_Adm = new JSeparator();
		separator_Adm.setForeground(new Color(204, 255, 255));
		separator_Adm.setBackground(new Color(255, 204, 255));
		mnMenu_Adm.add(separator_Adm);
		
		JMenuItem mntmMenuItem_AdSD = new JMenuItem("Mr. Susovan Das");
		mntmMenuItem_AdSD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eSD) {
				  panel_mnHm.setVisible(false);
				  panel_HmAb.setVisible(false);
				  panel_AdSS.setVisible(false);
				  panel_AdMH.setVisible(false);
				  panel_AdJK.setVisible(false);
				  panel_Intro.setVisible(false);
				  panel_PrpgmP0.setVisible(false);
				  panel_We.setVisible(false);
				  panel_AdSD.setVisible(true);
				  
			}
		});
		mntmMenuItem_AdSD.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_AdSD.setForeground(new Color(0, 0, 255));
		mntmMenuItem_AdSD.setBackground(new Color(127, 255, 212));
		mntmMenuItem_AdSD.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_Adm.add(mntmMenuItem_AdSD);
		
		JMenuItem mntmMenuItem_AdJK = new JMenuItem("Mr. Jeetu Kumar");
		mntmMenuItem_AdJK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eJK) {
				  panel_mnHm.setVisible(false);
				  panel_HmAb.setVisible(false);
				  panel_AdSS.setVisible(false);
				  panel_AdMH.setVisible(false);
				  panel_AdSD.setVisible(false);
				  panel_Intro.setVisible(false);
				  panel_PrpgmP0.setVisible(false);
				  panel_We.setVisible(false);
				  panel_AdJK.setVisible(true);
				  
			}
		});
		mntmMenuItem_AdJK.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_AdJK.setForeground(new Color(0, 0, 255));
		mntmMenuItem_AdJK.setBackground(new Color(127, 255, 212));
		mntmMenuItem_AdJK.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_Adm.add(mntmMenuItem_AdJK);
		
		JSeparator separator_AD = new JSeparator();
		separator_AD.setOrientation(SwingConstants.VERTICAL);
		separator_AD.setForeground(Color.BLACK);
		separator_AD.setBackground(Color.CYAN);
		menuBar.add(separator_AD);
		
		JMenu mnMenu_Intro = new JMenu("Introduction");
		mnMenu_Intro.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_Intro.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 26));
		mnMenu_Intro.setForeground(new Color(0, 0, 255));
		mnMenu_Intro.setBackground(new Color(0, 204, 153));
		menuBar.add(mnMenu_Intro);
		
		JMenuItem mntmMenuItem_IntSub = new JMenuItem("Intoduction To Subject");
		mntmMenuItem_IntSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eInstS) {
				  panel_mnHm.setVisible(false);
				  panel_HmAb.setVisible(false);
				  panel_AdSS.setVisible(false);
				  panel_AdMH.setVisible(false);
				  panel_AdSD.setVisible(false);
				  panel_AdJK.setVisible(false);
				  panel_PrpgmP0.setVisible(false);
				  panel_We.setVisible(false);
				  panel_Intro.setVisible(true);
				  
			}
		});
		mntmMenuItem_IntSub.setHorizontalAlignment(SwingConstants.CENTER);
		mntmMenuItem_IntSub.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_IntSub.setForeground(new Color(0, 0, 255));
		mntmMenuItem_IntSub.setBackground(new Color(255, 255, 51));
		mnMenu_Intro.add(mntmMenuItem_IntSub);
		
		JSeparator separator_Int = new JSeparator();
		separator_Int.setOrientation(SwingConstants.VERTICAL);
		separator_Int.setForeground(Color.BLACK);
		separator_Int.setBackground(Color.CYAN);
		menuBar.add(separator_Int);
		
		JMenu mnMenu_prog = new JMenu("Programs");
		mnMenu_prog.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_prog.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 26));
		mnMenu_prog.setForeground(new Color(0, 0, 255));
		mnMenu_prog.setBackground(new Color(0, 204, 153));
		menuBar.add(mnMenu_prog);
		
		JMenuItem mntmMenuItem_p0 = new JMenuItem("Simulation Of DFA");
		mntmMenuItem_p0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eP0) {
				  panel_mnHm.setVisible(false);
				  panel_HmAb.setVisible(false);
				  panel_AdSS.setVisible(false);
				  panel_AdMH.setVisible(false);
				  panel_AdSD.setVisible(false);
				  panel_AdJK.setVisible(false);
				  panel_Intro.setVisible(false);
				  panel_We.setVisible(false);
				  panel_P0Out.setVisible(false);
				  panel_p0Sm.setVisible(false);
				  panel_P0In.setVisible(true);
				  panel_PrpgmP0.setVisible(true);
				  
			}
		});
		mntmMenuItem_p0.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_p0.setForeground(new Color(0, 0, 255));
		mntmMenuItem_p0.setBackground(new Color(204, 255, 153));
		mntmMenuItem_p0.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_prog.add(mntmMenuItem_p0);
		
		JMenuItem mntmMenuItem_p1 = new JMenuItem("P1");
		mntmMenuItem_p1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_p1.setForeground(new Color(0, 0, 255));
		mntmMenuItem_p1.setBackground(new Color(204, 255, 153));
		mntmMenuItem_p1.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_prog.add(mntmMenuItem_p1);
		
		JMenuItem mntmMenuItem_p2 = new JMenuItem("P2");
		mntmMenuItem_p2.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_p2.setForeground(new Color(0, 0, 255));
		mntmMenuItem_p2.setBackground(new Color(204, 255, 153));
		mntmMenuItem_p2.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_prog.add(mntmMenuItem_p2);
		
		JMenuItem mntmMenuItem_p3 = new JMenuItem("P3");
		mntmMenuItem_p3.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_p3.setForeground(new Color(0, 0, 255));
		mntmMenuItem_p3.setBackground(new Color(204, 255, 153));
		mntmMenuItem_p3.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_prog.add(mntmMenuItem_p3);
		
		JMenuItem mntmMenuItem_p4 = new JMenuItem("P4");
		mntmMenuItem_p4.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_p4.setForeground(new Color(0, 0, 255));
		mntmMenuItem_p4.setBackground(new Color(204, 255, 153));
		mntmMenuItem_p4.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_prog.add(mntmMenuItem_p4);
		
		JMenuItem mntmMenuItem_p5 = new JMenuItem("P5");
		mntmMenuItem_p5.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_p5.setForeground(new Color(0, 0, 255));
		mntmMenuItem_p5.setBackground(new Color(204, 255, 153));
		mntmMenuItem_p5.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_prog.add(mntmMenuItem_p5);
		
		JMenuItem mntmMenuItem_p6 = new JMenuItem("P6");
		mntmMenuItem_p6.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_p6.setForeground(new Color(0, 0, 255));
		mntmMenuItem_p6.setBackground(new Color(204, 255, 153));
		mntmMenuItem_p6.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_prog.add(mntmMenuItem_p6);
		
		JMenuItem mntmMenuItem_p7 = new JMenuItem("P7");
		mntmMenuItem_p7.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_p7.setForeground(new Color(0, 0, 255));
		mntmMenuItem_p7.setBackground(new Color(204, 255, 153));
		mntmMenuItem_p7.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_prog.add(mntmMenuItem_p7);
		
		JSeparator separator_Prog = new JSeparator();
		separator_Prog.setOrientation(SwingConstants.VERTICAL);
		separator_Prog.setForeground(new Color(0, 0, 0));
		separator_Prog.setBackground(Color.CYAN);
		menuBar.add(separator_Prog);
		
		JMenu mnMenu_We = new JMenu("ReLWe");
		mnMenu_We.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_We.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 26));
		mnMenu_We.setForeground(new Color(0, 0, 255));
		mnMenu_We.setBackground(new Color(0, 204, 153));
		menuBar.add(mnMenu_We);
		
		JMenuItem mntmMenuItem_Wer = new JMenuItem("WeArE");
		mntmMenuItem_Wer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eWE) {
				  panel_mnHm.setVisible(false);
				  panel_HmAb.setVisible(false);
				  panel_AdSS.setVisible(false);
				  panel_AdMH.setVisible(false);
				  panel_AdSD.setVisible(false);
				  panel_AdJK.setVisible(false);
				  panel_Intro.setVisible(false);
				  panel_PrpgmP0.setVisible(false);
				  panel_We.setVisible(true);
			}
		});
		mntmMenuItem_Wer.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		mntmMenuItem_Wer.setForeground(new Color(0, 0, 255));
		mntmMenuItem_Wer.setBackground(new Color(255, 255, 102));
		mntmMenuItem_Wer.setHorizontalAlignment(SwingConstants.CENTER);
		mnMenu_We.add(mntmMenuItem_Wer);
		
	}
	
	
	
	
	public void InptP0MuL(JPanel fn, JPanel P0, JPanel P0In, JPanel P0Out)throws IOException {
		
		i=1;
		j=0;
		k=0;
	
		File InpUT = new File("Programs\\DFA_SIM\\Read_Write\\Input\\InpUT.txt");
		try {
			InpUT.createNewFile();
		}catch(Exception ef) {
			ef.printStackTrace();
		}
		
		FileWriter inp = new FileWriter("Programs\\DFA_SIM\\Read_Write\\Input\\InpUT.txt");	
	     BufferedWriter inpbf = new BufferedWriter(inp); 
	
		JPanel panel_inp_Sdf= new JPanel();
		panel_inp_Sdf.setBackground(new Color(255, 0, 255));
		panel_inp_Sdf.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_inp_Sdf.setBounds(100, 130, 700, 480);
		frmTcsmnfm.getContentPane().add(panel_inp_Sdf);
		panel_inp_Sdf.setLayout(null);
		
		JLabel lblNewLabel_hd = new JLabel("SIMULATION OF DFA");
		lblNewLabel_hd.setBackground(new Color(173, 255, 47));
		lblNewLabel_hd.setForeground(new Color(255, 255, 0));
		lblNewLabel_hd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_hd.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_hd.setBounds(140, 25, 360, 25);
        panel_inp_Sdf.add(lblNewLabel_hd);
         
        JPanel panel_stt = new JPanel();
        panel_stt.setForeground(new Color(0, 0, 255));
        panel_stt.setVisible(true);
        panel_stt.setBackground(new Color(255, 218, 185));
        panel_stt.setBounds(60, 70, 560, 50);
        panel_inp_Sdf.add(panel_stt);
        panel_stt.setLayout(null);
         
        JLabel lblNewLabel_enst = new JLabel("Enter The Number Of States(s) : ");
        lblNewLabel_enst.setFont(new Font("Tahoma", Font.ITALIC, 22));
        lblNewLabel_enst.setForeground(new Color(0, 0, 255));
        lblNewLabel_enst.setBounds(5, 10, 330, 30);
        panel_stt.add(lblNewLabel_enst);
         
        JTextField textField_stt = new JTextField();
        textField_stt.setBounds(350, 10, 100, 30);
        panel_stt.add(textField_stt);
        textField_stt.setColumns(10);
         
        JLabel lblNewLabel_Nstt = new JLabel();
        lblNewLabel_Nstt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
        lblNewLabel_Nstt.setVisible(false);
        lblNewLabel_Nstt.setForeground(new Color(255, 0, 0));
        lblNewLabel_Nstt.setBounds(350, 10, 100, 30);
        panel_stt.add(lblNewLabel_Nstt);
         
         
         
        JPanel panel_nffst = new JPanel();
        panel_nffst.setVisible(false);
        panel_nffst.setBackground(new Color(255, 235, 205));
        panel_nffst.setBounds(60, 120, 560, 50);
        panel_inp_Sdf.add(panel_nffst);
        panel_nffst.setLayout(null);
         
        JLabel lblNewLabel_nffst = new JLabel("Enter Number of Final State(s) :");
        lblNewLabel_nffst.setFont(new Font("Tahoma", Font.ITALIC, 22));
        lblNewLabel_nffst.setForeground(new Color(0, 0, 255));
        lblNewLabel_nffst.setBounds(5, 10, 330, 30);
        panel_nffst.add(lblNewLabel_nffst);
         
        JTextField textField_nffst = new JTextField();
        textField_nffst.setBounds(350, 10, 100, 30);
        panel_nffst.add(textField_nffst);
        textField_nffst.setColumns(10);
         
        JLabel lblNewLabel_shnfst = new JLabel();
        lblNewLabel_shnfst.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
        lblNewLabel_shnfst.setVisible(false);
        lblNewLabel_shnfst.setForeground(new Color(255, 0, 0));
        lblNewLabel_shnfst.setBounds(400, 10, 60, 30);
        panel_nffst.add(lblNewLabel_shnfst);
         
         
        JPanel panel_fsts = new JPanel();
 		panel_fsts.setVisible(false);
 		panel_fsts.setBackground(new Color(255, 228, 181));
 		panel_fsts.setBounds(80, 171, 500, 80);
 		panel_inp_Sdf.add(panel_fsts);
 		panel_fsts.setLayout(null);
 		
 		JLabel lblNewLabel_fsts = new JLabel();
 		lblNewLabel_fsts.setFont(new Font("Tahoma", Font.ITALIC, 24));
        lblNewLabel_fsts.setForeground(new Color(0, 0, 255));
 		lblNewLabel_fsts.setText("Final State ["+1+ "] is :");
 		lblNewLabel_fsts.setBounds(60, 5, 240, 30);
 		panel_fsts.add(lblNewLabel_fsts);
 		
 		JTextField textField_fsts = new JTextField();
 		textField_fsts.setBounds(330, 5, 100, 30);
 		panel_fsts.add(textField_fsts);
 		textField_fsts.setColumns(10);
 		
 		
        JPanel panel_trnf = new JPanel();
		panel_trnf.setVisible(false);
		panel_trnf.setBackground(new Color(255, 250, 205));
		panel_trnf.setBounds(85, 171, 500, 210);
		panel_inp_Sdf.add(panel_trnf);
		panel_trnf.setLayout(null);
		
		JLabel lblNewLabel_sttM = new JLabel();
		lblNewLabel_sttM.setForeground(new Color(0, 0, 255));
		lblNewLabel_sttM.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_sttM.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_sttM.setText("STATE OF MACHINE IS q["+0+"]");
		lblNewLabel_sttM.setBounds(100, 20, 300, 35);
		panel_trnf.add(lblNewLabel_sttM);
		
		
		JLabel lblNewLabel_Ss0 = new JLabel("When Scaned Symbol is 0 : ");
		lblNewLabel_Ss0.setForeground(new Color(0, 0, 255));
		lblNewLabel_Ss0.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblNewLabel_Ss0.setBounds(37, 70, 302, 37);
		panel_trnf.add(lblNewLabel_Ss0);
		
		JTextField textField_Ss0 = new JTextField();
	    textField_Ss0.setBounds(364, 68, 86, 30);
		panel_trnf.add(textField_Ss0);
		textField_Ss0.setColumns(10);
		
		JLabel lblNewLabel_Ss1 = new JLabel("When Scaned Symbol is 1 : ");
		lblNewLabel_Ss1.setForeground(new Color(0, 0, 255));
		lblNewLabel_Ss1.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblNewLabel_Ss1.setBounds(37, 118, 302, 37);
		panel_trnf.add(lblNewLabel_Ss1);
		
		JTextField textField_Ss1 = new JTextField();
		textField_Ss1.setBounds(364, 118, 86, 30);
		panel_trnf.add(textField_Ss1);
		textField_Ss1.setColumns(10);
		
		JPanel panel_inst = new JPanel();
		panel_inst.setVisible(false);
		panel_inst.setBackground(new Color(255, 228, 196));
		panel_inst.setBounds(60, 170, 560, 60);
		panel_inp_Sdf.add(panel_inst);
		panel_inst.setLayout(null);
		
		JLabel lblNewLabel_inst = new JLabel();
		lblNewLabel_inst.setText("Enter Initial State :");
		lblNewLabel_inst.setFont(new Font("Tahoma", Font.ITALIC, 22));
        lblNewLabel_inst.setForeground(new Color(0, 0, 255));
		lblNewLabel_inst.setBounds(20, 10, 240, 30);
		panel_inst.add(lblNewLabel_inst);
		
		JTextField textField_inst = new JTextField();
		textField_inst.setBounds(310, 10, 100, 30);
		panel_inst.add(textField_inst);
		textField_inst.setColumns(10);
		
		JLabel lblNewLabel_instt = new JLabel();
		lblNewLabel_instt.setVisible(false);
		lblNewLabel_instt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
        lblNewLabel_instt.setForeground(new Color(255, 0, 0));
		lblNewLabel_instt.setBounds(310, 10, 100, 30);
		panel_inst.add(lblNewLabel_instt);
		
		
		JPanel panel_0strc = new JPanel();
        panel_0strc.setVisible(false);
        panel_0strc.setBackground(new Color(255, 228, 181));
        panel_0strc.setBounds(60, 235, 560, 65);
        panel_inp_Sdf.add(panel_0strc);
        panel_0strc.setLayout(null);
        
        JLabel lblNewLabel_astrc = new JLabel("Do You Wants Perform String Cheack :");
        lblNewLabel_astrc.setFont(new Font("Tahoma", Font.ITALIC, 18));
        lblNewLabel_astrc.setForeground(new Color(255, 0, 0));
        lblNewLabel_astrc.setBounds(10, 20, 330, 20);
        panel_0strc.add(lblNewLabel_astrc);
        
        JLabel lblNewLabel_strcin = new JLabel();
        lblNewLabel_strcin.setForeground(new Color(0, 0, 128));
		lblNewLabel_strcin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_strcin.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_strcin.setText("(Enter 1 For Yes Or 0 For No)");
		lblNewLabel_strcin.setBounds(50, 40, 220, 15);
		panel_0strc.add(lblNewLabel_strcin);
        
		JTextField textField_astc = new JTextField();
        textField_astc.setBounds(350, 20, 90, 30);
        panel_0strc.add(textField_astc);
        textField_astc.setColumns(10);
        
        JLabel lblNewLabel_entn = new JLabel();
        lblNewLabel_entn.setForeground(new Color(255, 0, 0));
        lblNewLabel_entn.setVisible(false);
		lblNewLabel_entn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_entn.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_entn.setBounds(350, 20, 90, 30);
		panel_0strc.add(lblNewLabel_entn);
        
       
        JPanel panel_strc = new JPanel();
		panel_strc.setVisible(false);
		panel_strc.setBackground(new Color(255, 250, 205));
		panel_strc.setBounds(60, 300, 560, 120);
		panel_inp_Sdf.add(panel_strc);
		panel_strc.setLayout(null);
		
		JLabel lblNewLabel_strc = new JLabel();
		lblNewLabel_strc.setForeground(new Color(255, 20, 147));
		lblNewLabel_strc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_strc.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_strc.setText("Enter The String ");
		lblNewLabel_strc.setBounds(140, 10, 250, 20);
		panel_strc.add(lblNewLabel_strc);
		
		JTextField textField_strng = new JTextField();
		textField_strng.setFont(new Font("Tahoma", Font.ITALIC, 20));
		textField_strng.setBackground(new Color(250, 250, 210));
		textField_strng.setForeground(Color.BLUE);
		textField_strng.setBounds(20, 40, 520, 30);
		panel_strc.add(textField_strng);
		textField_strng.setColumns(1000);
		
		
		JPanel panel_exec = new JPanel();
		panel_exec.setVisible(false);
		panel_exec.setBackground(new Color(255, 127, 80));
		panel_exec.setBounds(420, 305, 200, 50);
		panel_inp_Sdf.add(panel_exec);
		panel_exec.setLayout(null);
		
		
		JButton btnButton_bck = new JButton("Back");
		btnButton_bck.setForeground(new Color(184, 134, 11));
		btnButton_bck.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ex) {
			panel_inp_Sdf.setVisible(false);
			fn.setVisible(true);
			P0.setVisible(true);
		    P0In.setVisible(true);
			P0Out.setVisible(false);	
			} });
		btnButton_bck.setBounds(10,10, 90, 30);
		panel_exec.add(btnButton_bck);
		
		JButton btnButton_exe = new JButton("Execute");
		btnButton_exe.setForeground(new Color(0, 0, 255));
		btnButton_exe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ex) {
				
				try {
			    	 //Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && 0dFaSiM.exe\"");
			       //Runtime.getRuntime().exec("C:\\Users\\Project\\Desktop\\New folder (2)\\Dev-Cpp.exe");
			    	// Process p = Runtime.getRuntime().exec("C:\\Users\\Project\\Desktop\\Folder_DevC\\Dev-Cpp\\devcpp.exe");
					//Runtime runtime = Runtime.getRuntime();
					 //String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","http://iomaorissa.ac.in/"};
				    //String[] s = new String[] {"C:\\Users\\Project\\Desktop\\Folder_DevC\\Dev-Cpp\\devcpp.exe","C:\\Windows\\System32\\1dFaSiM.cpp"};
					//String[] s = new String[] {"C:\\Users\\Project\\Desktop\\Folder_DevC\\Dev-Cpp\\devcpp.exe","C:\\0dFaSiM.exe"};
					 //String[] s = new String[] {"C:\\Users\\Project\\Desktop\\Folder_DevC\\Dev-Cpp\\devcpp.exe","C:\\Windows\\System32\\1dFaSiM.exe"};
					try {
						//runtime.exec(s);
						Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && SimDFA.exe\"");
						
						
					}catch(IOException eIMu) {
						eIMu.printStackTrace();
					}
			    	 try {
							panel_inp_Sdf.setVisible(false);
							fn.setVisible(true);
							P0.setVisible(true);
						    P0In.setVisible(false);
							P0Out.setVisible(true);
							}catch(Exception enfm) {
								enfm.printStackTrace();
								JOptionPane.showMessageDialog(null, "$$$ Sorry For Interrupt.\n Something Went Wrong.");
							}
			    	 
					}catch(Exception erx){
						erx.printStackTrace();
						System.out.println ("Problem");
					}

			}
		});
		btnButton_exe.setBounds(100, 10, 90, 30);
		panel_exec.add(btnButton_exe);
		
		
	   JButton btnButton_0strc = new JButton("Enter");
	   btnButton_0strc.setForeground(new Color(0, 0, 139));
	   btnButton_0strc.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e0st) {
			try {
				 String strb = textField_astc.getText();
				 b=Integer.parseInt(strb);
				
				if(b==1) {
					inpbf.write(strb);
				 	inpbf.newLine();
					
					btnButton_0strc.setVisible(false);
					textField_astc.setVisible(false);
					lblNewLabel_entn.setText(strb);
					lblNewLabel_entn.setVisible(true);
					panel_strc.setVisible(true);
					
				}
				if(b==0) {
					inpbf.write(strb);
				 	inpbf.newLine(); 
					inpbf.close();
					inp.close();
				    
					
					panel_strc.setVisible(false);
					btnButton_0strc.setVisible(false);
					textField_astc.setVisible(false);
					lblNewLabel_entn.setText(strb);
					lblNewLabel_entn.setVisible(true);
					panel_exec.setVisible(true);
					
				}
				
				if(b!=0 && b!=1) {
					 
					 textField_astc.setText("");
	    			 JOptionPane.showMessageDialog(null, " Please Enter the value with in Scope. \n Or See The Instruction... ");
				}
				
				 
			 }catch(Exception e5) {
				 textField_astc.setText("");
				 JOptionPane.showMessageDialog(null, " Please Enter Valid Input."); 
			 }	
			
			}
		});
	    btnButton_0strc.setBounds(460, 20, 90, 30);
	    panel_0strc.add(btnButton_0strc);
	    
	    
	    JButton btnButton_strs = new JButton("Enter");
		btnButton_strs.setForeground(new Color(0, 0, 205));
	    btnButton_strs.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent est) {
	    		  String strst = textField_strng.getText();
				   if(strst.isEmpty()) {
						 JOptionPane.showMessageDialog(null, "Your are not allowed for empty string.");
						}
				   k=0;
				   if(strst.length() > 1000) {
					   JOptionPane.showMessageDialog(null, "String is too long./n Please make inpute with in scope...");
				   }
				   
				   if(!strst.equals("") && strst.length()<1001) {	
					while(k<strst.length()) {
					
						if((strst.charAt(k) != '0') && (strst.charAt(k) !='1')) 
						{
						 JOptionPane.showMessageDialog(null, " Please Valid String./n Check your string at "+(k+1)+"th position");
						 break;
						}
						k=k+1;
					    
					}
					if(k != 0 && k==strst.length()) {
						 try {
								inpbf.write(strst);
								inpbf.newLine();
								
							    }catch(Exception estp) {
							    	estp.printStackTrace();
							    	JOptionPane.showMessageDialog(null, "Problem 1 Is Here");	
							    }
					}
					
				   }	
				   if(k!=0 && k==strst.length()) {
						
					    textField_strng.setText(null);
						panel_strc.setVisible(false);
						lblNewLabel_entn.setVisible(false);
						textField_astc.setVisible(true);
						textField_astc.setText(null);
						btnButton_0strc.setVisible(true);
							
						}
				
			}
		});
	    btnButton_strs.setBounds(210, 80, 90, 30);
		panel_strc.add(btnButton_strs);
		
	   
	    
 		JButton btnButton__nffst = new JButton("Enter");
 		btnButton__nffst.setForeground(new Color(0, 0, 205));
 		btnButton__nffst.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent ef) {
		    	try {
		    		String str0=textField_nffst.getText();
		    		 n = Integer.parseInt(str0);
		    		 if(n>0 && n<=N) {
		    		 btnButton__nffst.setVisible(false);	 
		    	     lblNewLabel_nffst.setText("Number Of Final State In Machine Is :");
		    	     lblNewLabel_nffst.setBounds(10, 10, 380, 30);
		    	     lblNewLabel_shnfst.setText(str0);
		    	     textField_nffst.setVisible(false);
		    	     lblNewLabel_shnfst.setVisible(true);
		    		 panel_fsts.setVisible(true);
		    		 
		    		 inpbf.write(str0);
			 	     inpbf.newLine();   
		    		 
		    		 }
		    		 if(n<=0 || n>N) {
		    			 textField_nffst.setText("");
		    			 JOptionPane.showMessageDialog(null, " Please Enter the value with in Scope. \n Or See The Instruction... ");
		    		 }
		    		
		    	 }catch(Exception e3) {
		    		textField_nffst.setText("");
					JOptionPane.showMessageDialog(null, " Please Enter Valid Input.");
		    	 }	
		    	
		    	
		      	}
		    }); 
 		btnButton__nffst.setBounds(460, 10, 90, 30);
        panel_nffst.add(btnButton__nffst);
        
       
        JButton btnButton_fsts = new JButton("Enter");
		btnButton_fsts.setForeground(new Color(0, 0, 205));
		btnButton_fsts.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent efs) {
					try {
						String str1=textField_fsts.getText();
						n0=Integer.parseInt(str1);
						if((n0>=0 && n0<N) && i<=n) {
					    
					    inpbf.write(str1);
				 	    inpbf.newLine(); 
					    
					    i=i+1;
					    textField_fsts.setText("");	
					    lblNewLabel_fsts.setText("Final State ["+i+ "] is :");
						
						}
						if((n0<0 || n0>=N) && i<=n) {
							textField_fsts.setText("");
			    			JOptionPane.showMessageDialog(null, " Please Enter the value with in Scope. \n Or See The Instruction... ");	
						}
					   if(i>n) {
							panel_fsts.setVisible(false);
							panel_trnf.setVisible(true);
							
						}
						
					}catch(Exception e2) {
						textField_fsts.setText("");
						JOptionPane.showMessageDialog(null, " Please Enter Valid Input.");
					}
				}
			});  
		btnButton_fsts.setBounds(210, 40, 90, 30);
 		panel_fsts.add(btnButton_fsts);
 		
        
        JButton btnButton_trnf = new JButton("Enter");
        btnButton_trnf.setForeground(new Color(0, 0, 205));
        btnButton_trnf.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent etr) {
					try {
						
						 String str2, str3;
			 		     str2 = textField_Ss0.getText();
			 		     str3 = textField_Ss1.getText();
			 		    
			 		     n1 = Integer.parseInt(str2);
			 		     n2 = Integer.parseInt(str3);
			 		     
			           if((j<N) && ((n1>=0 && n1<N) && (n2>=0 && n2<N))) {
            	          inpbf.write(str2);
			 	          inpbf.newLine();
			 	          inpbf.write(str3);
			 	          inpbf.newLine(); 
			 		    
			 		      j=j+1;
						  lblNewLabel_sttM.setText("STATE OF MACHINE IS q["+j+"]");
						  textField_Ss0.setText("");
						  textField_Ss1.setText("");
					  }
              
                      if (j<N && ((n1<0||n1>=N) || (n2<0||n2>=N))) {
						JOptionPane.showMessageDialog(null, " Input is beyond selected number of scope \n Please Enter Number With In Selected Scope Or See The Instruction ");
						textField_Ss0.setText("");
						textField_Ss1.setText("");
						
					 } 
              
                    if(j>=N) {
						
						panel_trnf.setVisible(false);
						panel_inst.setVisible(true);
						
					}
					
				}catch(Exception e1) {
					textField_Ss0.setText("");
					textField_Ss1.setText("");
					JOptionPane.showMessageDialog(null, " Please Enter Valid Input. \n Follow The Instruction... ");
				}
					
				}
			});  
		btnButton_trnf.setBounds(205, 170, 90, 30);
		panel_trnf.add(btnButton_trnf);
		
		
		JButton btnButton_inst = new JButton("Enter");
	    btnButton_inst.setForeground(new Color(0, 0, 205));
	    btnButton_inst.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ei) {
				 try {
					 String strin=textField_inst.getText();
					 int ins=Integer.parseInt(strin);
					 if(ins>=0 && ins<N) {
						 
						inpbf.write(strin);
				 	    inpbf.newLine(); 
				 	    
						 btnButton_inst.setVisible(false);
						 lblNewLabel_instt.setText(strin);
						 textField_inst.setVisible(false);
						 lblNewLabel_instt.setVisible(true);
						 panel_0strc.setVisible(true); 
					 }
					 if(ins<0 || ins>=N) {
						 textField_inst.setText("");
		    			 JOptionPane.showMessageDialog(null, " Please Enter the value with in Scope. \n Or See The Instruction... ");
						 
					 }
					 
				 }catch(Exception e4) {
					JOptionPane.showMessageDialog(null, " Please Enter Valid Input ");
		 			textField_inst.setText("");
				 }
					
				}
			});  
	    
		btnButton_inst.setBounds(440, 10, 100, 30);
		panel_inst.add(btnButton_inst);
	    
		
		
       
	   JButton btnButton_nst = new JButton("Enter");
	   btnButton_nst.setForeground(new Color(0, 0, 128));
	   btnButton_nst.setBackground(new Color(240, 255, 240));
	   btnButton_nst.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		try {
		 			 String str =  textField_stt.getText();
		 		     N = Integer.parseInt(str);
		 		     if( N<=0 || N>100 ) {
		 			    textField_stt.setText("");
		 			    textField_stt.setVisible(true);
		 			    btnButton_nst.setVisible(true);
			 		    lblNewLabel_Nstt.setVisible(false);
			 		    panel_trnf.setVisible(false); 
		 			    JOptionPane.showMessageDialog(null, "Input Is Out Of Scope \n Enter Valid Inpute");
		 			  
		 		    }
		 		   
		 		   if(N>0 && N<=100) {
		 			btnButton_nst.setVisible(false);   
		 		    textField_stt.setVisible(false);
		 		    lblNewLabel_enst.setText("The Number Of States Entred:");
		 		    lblNewLabel_Nstt.setText(str);
		 		   
		 		   try { 
		 		   
		 		   inpbf.write(str);
		 		   inpbf.newLine();
		 		     
		 		   }catch(Exception er) {
		 			   er.printStackTrace();
		 			  JOptionPane.showMessageDialog(null, "Problem Is Here"); 
		 		   }
		 		    
		 		    lblNewLabel_Nstt.setVisible(true);
		 		    panel_nffst.setVisible(true);
		 		    
		 		   } 
		 
		 	 } catch(Exception e) {
		 			JOptionPane.showMessageDialog(null, " Please Enter Valid Input ");
		 			textField_stt.setText("");
		 			textField_stt.setVisible(true);
		 			btnButton_nst.setVisible(true);
		 			panel_trnf.setVisible(false);
		 			lblNewLabel_Nstt.setVisible(false);
		 			}
		 			
		 	}
		 });
         btnButton_nst.setBounds(460, 10, 90, 30);
         panel_stt.add(btnButton_nst);
		
		
	}
	
	
	public void InptP0Aut(JPanel P0In, JPanel P0Out) throws IOException{
		
		File InpUT = new File("Programs\\DFA_SIM\\Read_Write\\Input\\InpUT.txt");
		try {
			InpUT.createNewFile();
		}catch(Exception ef) {
			ef.printStackTrace();
		}
		
		FileWriter inp = new FileWriter("Programs\\DFA_SIM\\Read_Write\\Input\\InpUT.txt");	
	    BufferedWriter inpbfA = new BufferedWriter(inp);
	     
	    Random tranrl = new Random();
	    int N = 1 + tranrl.nextInt(100);
	    inpbfA.write(""+N);
		inpbfA.newLine();
		int n = tranrl.nextInt(N);
		inpbfA.write(""+n);
		inpbfA.newLine();
		for(int i=0; i<n; i++) {
		  int fsts = tranrl.nextInt(N);
		  inpbfA.write(""+fsts);
		  inpbfA.newLine();
		}
		for(int i=0; i<N; i++) {
			int wSs0 = tranrl.nextInt(N);
			inpbfA.write(""+wSs0);
			inpbfA.newLine();
			int wSs1 = tranrl.nextInt(N);
			inpbfA.write(""+wSs1);
			inpbfA.newLine();
		}
		int inLst = tranrl.nextInt(N);
		inpbfA.write(""+inLst);
		
		
		int StrCB = 3 + tranrl.nextInt(20);
		for(int i=0; i<StrCB; i++) {
			inpbfA.newLine();
			inpbfA.write(""+1);
			inpbfA.newLine();
			int StRlEn = 1 + tranrl.nextInt(500);
			for(int j=0; j<StRlEn; j++) {
				int StrCh = tranrl.nextInt(2);
				inpbfA.write(""+StrCh);
			}
			
		} 
		
		inpbfA.newLine();
		inpbfA.write(""+0);
		inpbfA.newLine();
		
		//Image img_JK = new ImageIcon(this.getClass().getResource("/jkpp.jpg")).getImage();
		//lblLabel_JK1.setIcon(new ImageIcon(img_JK));
		
		// Process p = Runtime.getRuntime().exec("C:\\Users\\Project\\Desktop\\Folder_DevC\\Dev-Cpp\\devcpp.exe");
		//Runtime runtime = Runtime.getRuntime();
		 //String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","http://iomaorissa.ac.in/"};
	    //String[] s = new String[] {"C:\\Users\\Project\\Desktop\\Folder_DevC\\Dev-Cpp\\devcpp.exe","C:\\Windows\\System32\\1dFaSiM.cpp"};
		//String[] s = new String[] {"C:\\Users\\Project\\Desktop\\Folder_DevC\\Dev-Cpp\\devcpp.exe","C:\\0dFaSiM.exe"};
		
		
		
		try {
			Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && SimDFA.exe\"");
			P0In.setVisible(false); 
			P0Out.setVisible(true);
		}catch(IOException eIAut) {
			eIAut.printStackTrace();
		}
		
		inpbfA.close();
		inp.close();
		
	} 
}
