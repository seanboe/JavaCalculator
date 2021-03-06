/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 /*

 
RUN THIS FILE TO START JACAS


 */
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author bc
 */
public class GUIv3 extends javax.swing.JFrame {

    /**
     * Creates new form GUIv3
     */
    public GUIv3() {
        String infix = "x^2+1";

        if (infix.indexOf("=") != -1) {
            //Subtract right side from left side
            String rightside = infix.substring(infix.indexOf("=") + 1);
            String leftside = infix.substring(0, infix.indexOf("="));
            infix = leftside + "- (" + rightside + ")";
            System.out.println(infix);
        }

        String rpn = InfixParser.parse(infix);

        ArrayList < Function > blaze = InfixParser.stringRPNtoList(rpn);

        //blaze = InfixParser.reverseStack(blaze);

        f = InfixParser.RPNCruncher(blaze);

        initComponents();
    }

    /**
     * Initialize components, set locations and colors, etc
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        darkleftbar = new javax.swing.JPanel();
        sidetab1 = new javax.swing.JPanel();
        indicator1 = new javax.swing.JPanel();
        homelabel = new javax.swing.JLabel();
        sidetab2 = new javax.swing.JPanel();
        indicator2 = new javax.swing.JPanel();
        computelabel = new javax.swing.JLabel();
        sidetab3 = new javax.swing.JPanel();
        indicator3 = new javax.swing.JPanel();
        computelabel1 = new javax.swing.JLabel();
        sidetab5 = new javax.swing.JPanel();
        indicator4 = new javax.swing.JPanel();
        computelabel2 = new javax.swing.JLabel();
        sidetab7 = new javax.swing.JPanel();
        indicator5 = new javax.swing.JPanel();
        computelabel3 = new javax.swing.JLabel();
        sidetab8 = new javax.swing.JPanel();
        indicator6 = new javax.swing.JPanel();
        computelabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        topbluebar = new javax.swing.JPanel();
        middlebluesection = new javax.swing.JPanel();
        palebluebar = new javax.swing.JPanel();
        jcaslabel = new javax.swing.JLabel();
        palerbluebar = new javax.swing.JPanel();
        yourequationlabel = new javax.swing.JLabel();
        rpnlabel = new javax.swing.JLabel();
        equationinputfield = new javax.swing.JTextField();
        rpnequationoutputlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptiontextfield = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        computeinputlabel = new javax.swing.JLabel();
        computeinputfield = new javax.swing.JTextField();
        computeoutputlabel = new javax.swing.JLabel();
        computeoutputvaluelabel = new javax.swing.JLabel();
        computebutton = new javax.swing.JButton();
        deriveinputlabel = new javax.swing.JLabel();
        deriveinputfield = new javax.swing.JTextField();
        derivebutton = new javax.swing.JButton();
        deriveoutputlabel = new javax.swing.JLabel();
        deriveoutputvaluelabel = new javax.swing.JLabel();
        integralsymbollabel = new javax.swing.JLabel();
        integrallowerboundlabel = new javax.swing.JTextField();
        integralupperboundlabel = new javax.swing.JTextField();
        integratebutton = new javax.swing.JButton();
        integraloutputlabel = new javax.swing.JLabel();
        statsinputlabelfield = new javax.swing.JTextField();
        statsinputdatalabel = new javax.swing.JLabel();
        computeSebutton = new javax.swing.JButton();
        statsinputdatalabel1 = new javax.swing.JLabel();
        statsinputlabelfield1 = new javax.swing.JTextField();
        computesumofresidualssquaredbutton = new javax.swing.JButton();
        statsinputdatalabel2 = new javax.swing.JLabel();
        statsinputlabelfield2 = new javax.swing.JTextField();
        computeresidualvaluesbutton = new javax.swing.JButton();
        computeypredictedvaluesbutton = new javax.swing.JButton();
        computelsrloutputbutton = new javax.swing.JButton();
        displaylsrlequationbutton = new javax.swing.JButton();
        computeabutton = new javax.swing.JButton();
        computebbutton = new javax.swing.JButton();
        computerbutton = new javax.swing.JButton();
        computersquaredvaluebutton = new javax.swing.JButton();
        computezprobmidpointriemann = new javax.swing.JButton();
        computezmeanstesthasgreaterthanvalue = new javax.swing.JButton();
        computezmeanshaslessthanvaluebutton = new javax.swing.JButton();
        computeSebutton12 = new javax.swing.JButton();
        statsoutputlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        darkleftbar.setBackground(new java.awt.Color(23, 35, 51));

        sidetab1.setBackground(new java.awt.Color(41, 57, 80));
        sidetab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidetab1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout indicator1Layout = new javax.swing.GroupLayout(indicator1);
        indicator1.setLayout(indicator1Layout);
        indicator1Layout.setHorizontalGroup(
            indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicator1Layout.setVerticalGroup(
            indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        homelabel.setForeground(java.awt.Color.white);
        homelabel.setText("Home");

        javax.swing.GroupLayout sidetab1Layout = new javax.swing.GroupLayout(sidetab1);
        sidetab1.setLayout(sidetab1Layout);
        sidetab1Layout.setHorizontalGroup(
            sidetab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidetab1Layout.createSequentialGroup()
                .addComponent(indicator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidetab1Layout.setVerticalGroup(
            sidetab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidetab1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(homelabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        sidetab2.setBackground(new java.awt.Color(23, 35, 51));
        sidetab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidetab2MousePressed(evt);
            }
        });

        indicator2.setOpaque(false);

        javax.swing.GroupLayout indicator2Layout = new javax.swing.GroupLayout(indicator2);
        indicator2.setLayout(indicator2Layout);
        indicator2Layout.setHorizontalGroup(
            indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicator2Layout.setVerticalGroup(
            indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        computelabel.setForeground(java.awt.Color.white);
        computelabel.setText("Compute");

        javax.swing.GroupLayout sidetab2Layout = new javax.swing.GroupLayout(sidetab2);
        sidetab2.setLayout(sidetab2Layout);
        sidetab2Layout.setHorizontalGroup(
            sidetab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidetab2Layout.createSequentialGroup()
                .addComponent(indicator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(computelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidetab2Layout.setVerticalGroup(
            sidetab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidetab2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(computelabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidetab3.setBackground(new java.awt.Color(23, 35, 51));
        sidetab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidetab3MousePressed(evt);
            }
        });

        indicator3.setOpaque(false);

        javax.swing.GroupLayout indicator3Layout = new javax.swing.GroupLayout(indicator3);
        indicator3.setLayout(indicator3Layout);
        indicator3Layout.setHorizontalGroup(
            indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicator3Layout.setVerticalGroup(
            indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        computelabel1.setForeground(java.awt.Color.white);
        computelabel1.setText("Derive");

        javax.swing.GroupLayout sidetab3Layout = new javax.swing.GroupLayout(sidetab3);
        sidetab3.setLayout(sidetab3Layout);
        sidetab3Layout.setHorizontalGroup(
            sidetab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidetab3Layout.createSequentialGroup()
                .addComponent(indicator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(computelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );
        sidetab3Layout.setVerticalGroup(
            sidetab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidetab3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(computelabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidetab5.setBackground(new java.awt.Color(23, 35, 51));
        sidetab5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidetab5MousePressed(evt);
            }
        });

        indicator4.setOpaque(false);

        javax.swing.GroupLayout indicator4Layout = new javax.swing.GroupLayout(indicator4);
        indicator4.setLayout(indicator4Layout);
        indicator4Layout.setHorizontalGroup(
            indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicator4Layout.setVerticalGroup(
            indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        computelabel2.setForeground(java.awt.Color.white);
        computelabel2.setText("Integrate");

        javax.swing.GroupLayout sidetab5Layout = new javax.swing.GroupLayout(sidetab5);
        sidetab5.setLayout(sidetab5Layout);
        sidetab5Layout.setHorizontalGroup(
            sidetab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidetab5Layout.createSequentialGroup()
                .addComponent(indicator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(computelabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );
        sidetab5Layout.setVerticalGroup(
            sidetab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidetab5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(computelabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidetab7.setBackground(new java.awt.Color(23, 35, 51));
        sidetab7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidetab7MousePressed(evt);
            }
        });

        indicator5.setOpaque(false);

        javax.swing.GroupLayout indicator5Layout = new javax.swing.GroupLayout(indicator5);
        indicator5.setLayout(indicator5Layout);
        indicator5Layout.setHorizontalGroup(
            indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicator5Layout.setVerticalGroup(
            indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        computelabel3.setForeground(java.awt.Color.white);
        computelabel3.setText("Graph");

        javax.swing.GroupLayout sidetab7Layout = new javax.swing.GroupLayout(sidetab7);
        sidetab7.setLayout(sidetab7Layout);
        sidetab7Layout.setHorizontalGroup(
            sidetab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidetab7Layout.createSequentialGroup()
                .addComponent(indicator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(computelabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );
        sidetab7Layout.setVerticalGroup(
            sidetab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidetab7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(computelabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidetab8.setBackground(new java.awt.Color(23, 35, 51));
        sidetab8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidetab8MousePressed(evt);
            }
        });

        indicator6.setOpaque(false);

        javax.swing.GroupLayout indicator6Layout = new javax.swing.GroupLayout(indicator6);
        indicator6.setLayout(indicator6Layout);
        indicator6Layout.setHorizontalGroup(
            indicator6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        indicator6Layout.setVerticalGroup(
            indicator6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        computelabel4.setForeground(java.awt.Color.white);
        computelabel4.setText("Stats");

        javax.swing.GroupLayout sidetab8Layout = new javax.swing.GroupLayout(sidetab8);
        sidetab8.setLayout(sidetab8Layout);
        sidetab8Layout.setHorizontalGroup(
            sidetab8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidetab8Layout.createSequentialGroup()
                .addComponent(indicator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(computelabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );
        sidetab8Layout.setVerticalGroup(
            sidetab8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidetab8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(computelabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout darkleftbarLayout = new javax.swing.GroupLayout(darkleftbar);
        darkleftbar.setLayout(darkleftbarLayout);
        darkleftbarLayout.setHorizontalGroup(
            darkleftbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidetab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidetab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidetab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidetab5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidetab7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidetab8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        darkleftbarLayout.setVerticalGroup(
            darkleftbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(darkleftbarLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(sidetab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sidetab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sidetab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sidetab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sidetab7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sidetab8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topbluebar.setBackground(new java.awt.Color(71, 120, 197));

        javax.swing.GroupLayout topbluebarLayout = new javax.swing.GroupLayout(topbluebar);
        topbluebar.setLayout(topbluebarLayout);
        topbluebarLayout.setHorizontalGroup(
            topbluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        topbluebarLayout.setVerticalGroup(
            topbluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        middlebluesection.setBackground(new java.awt.Color(71, 120, 197));

        palebluebar.setBackground(new java.awt.Color(120, 168, 252));

        jcaslabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jcaslabel.setForeground(java.awt.Color.white);
        jcaslabel.setText("JACAS - Computer Algebra with 1990s software");

        javax.swing.GroupLayout palebluebarLayout = new javax.swing.GroupLayout(palebluebar);
        palebluebar.setLayout(palebluebarLayout);
        palebluebarLayout.setHorizontalGroup(
            palebluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palebluebarLayout.createSequentialGroup()
                .addComponent(jcaslabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        palebluebarLayout.setVerticalGroup(
            palebluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palebluebarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jcaslabel)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        palerbluebar.setBackground(new java.awt.Color(84, 127, 206));

        yourequationlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        yourequationlabel.setForeground(java.awt.Color.white);
        yourequationlabel.setText("Enter Your Equation:");

        rpnlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rpnlabel.setForeground(java.awt.Color.white);
        rpnlabel.setText("Reverse Polish Notation:");

        equationinputfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        equationinputfield.setText("x^2+1");
        equationinputfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equationinputfieldActionPerformed(evt);
            }
        });

        rpnequationoutputlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rpnequationoutputlabel.setForeground(java.awt.Color.white);
        rpnequationoutputlabel.setText("x 2 ^ 1 +");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("No zeros");

        javax.swing.GroupLayout palerbluebarLayout = new javax.swing.GroupLayout(palerbluebar);
        palerbluebar.setLayout(palerbluebarLayout);
        palerbluebarLayout.setHorizontalGroup(
            palerbluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palerbluebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(palerbluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(palerbluebarLayout.createSequentialGroup()
                        .addGroup(palerbluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rpnlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yourequationlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(palerbluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equationinputfield)
                            .addComponent(rpnequationoutputlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        palerbluebarLayout.setVerticalGroup(
            palerbluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palerbluebarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(palerbluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourequationlabel)
                    .addComponent(equationinputfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(palerbluebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rpnlabel)
                    .addComponent(rpnequationoutputlabel))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        descriptiontextfield.setBackground(new java.awt.Color(71, 120, 197));
        descriptiontextfield.setColumns(20);
        descriptiontextfield.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        descriptiontextfield.setForeground(java.awt.Color.white);
        descriptiontextfield.setRows(5);
        descriptiontextfield.setText("JACAS is the Q4 Project AP Computer\nScience project by Siddarth Calidas, \nSean Boerhout and Vignesh Nydhruva.");
        descriptiontextfield.setBorder(null);
        jScrollPane1.setViewportView(descriptiontextfield);

        javax.swing.GroupLayout middlebluesectionLayout = new javax.swing.GroupLayout(middlebluesection);
        middlebluesection.setLayout(middlebluesectionLayout);
        middlebluesectionLayout.setHorizontalGroup(
            middlebluesectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(palebluebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(palerbluebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        middlebluesectionLayout.setVerticalGroup(
            middlebluesectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlebluesectionLayout.createSequentialGroup()
                .addComponent(palebluebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(palerbluebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        jPanel3.setBackground(java.awt.Color.white);

        computeinputlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        computeinputlabel.setText("Input(x): ");

        computeinputfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        computeinputfield.setText("69");
        computeinputfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeinputfieldActionPerformed(evt);
            }
        });

        computeoutputlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        computeoutputlabel.setText("Output(y)");

        computeoutputvaluelabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        computeoutputvaluelabel.setText(" 420");

        computebutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        computebutton.setText("Compute");
        computebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computebuttonMousePressed(evt);
            }
        });
        computebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computebuttonActionPerformed(evt);
            }
        });

        deriveinputlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deriveinputlabel.setText("Input(x): ");

        deriveinputfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deriveinputfield.setText("69");
        deriveinputfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deriveinputfieldActionPerformed(evt);
            }
        });

        derivebutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        derivebutton.setText("Derive");
        derivebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                derivebuttonMousePressed(evt);
            }
        });
        derivebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivebuttonActionPerformed(evt);
            }
        });

        deriveoutputlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deriveoutputlabel.setText("Output(dy/dx)");

        deriveoutputvaluelabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deriveoutputvaluelabel.setText(" 420");

        integralsymbollabel.setFont(new java.awt.Font("Segoe UI", 0, 128)); // NOI18N
        integralsymbollabel.setText("???f(x)dx = ");

        integrallowerboundlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        integrallowerboundlabel.setText("Lower");
        integrallowerboundlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrallowerboundlabelActionPerformed(evt);
            }
        });

        integralupperboundlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        integralupperboundlabel.setText("Upper");
        integralupperboundlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integralupperboundlabelActionPerformed(evt);
            }
        });

        integratebutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        integratebutton.setText("Integrate");
        integratebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integratebuttonActionPerformed(evt);
            }
        });

        integraloutputlabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        integraloutputlabel.setText("69");

        statsinputlabelfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statsinputlabelfield.setText("1, 2, 3, 4");

        statsinputdatalabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statsinputdatalabel.setText("Input data row 1:");

        computeSebutton.setText("computeSe");
        computeSebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computeSebuttonMousePressed(evt);
            }
        });

        statsinputdatalabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statsinputdatalabel1.setText("Input data row 3");

        statsinputlabelfield1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statsinputlabelfield1.setText("1, 2, 3, 4");
        statsinputlabelfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsinputlabelfield1ActionPerformed(evt);
            }
        });

        computesumofresidualssquaredbutton.setText("computeSumOfResidualsSquared");
        computesumofresidualssquaredbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computesumofresidualssquaredbuttonMousePressed(evt);
            }
        });

        statsinputdatalabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statsinputdatalabel2.setText("Input data row 2");

        statsinputlabelfield2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statsinputlabelfield2.setText("1, 2, 3, 4");
        statsinputlabelfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsinputlabelfield2ActionPerformed(evt);
            }
        });

        computeresidualvaluesbutton.setText("computeResidualValues");
        computeresidualvaluesbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computeresidualvaluesbuttonMousePressed(evt);
            }
        });

        computeypredictedvaluesbutton.setText("computeYPredictedValues");
        computeypredictedvaluesbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computeypredictedvaluesbuttonMousePressed(evt);
            }
        });

        computelsrloutputbutton.setText("computeLSRLOutput");
        computelsrloutputbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computelsrloutputbuttonMousePressed(evt);
            }
        });

        displaylsrlequationbutton.setText("displayLSRLEquation");

        computeabutton.setText("computeA");
        computeabutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computeabuttonMousePressed(evt);
            }
        });

        computebbutton.setText("computeB");
        computebbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computebbuttonMousePressed(evt);
            }
        });

        computerbutton.setText("computeR");
        computerbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computerbuttonMousePressed(evt);
            }
        });

        computersquaredvaluebutton.setText("computersquaredvalue");
        computersquaredvaluebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computersquaredvaluebuttonMousePressed(evt);
            }
        });

        computezprobmidpointriemann.setText("computezprobmidpointriemann ");
        computezprobmidpointriemann.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computezprobmidpointriemannMousePressed(evt);
            }
        });

        computezmeanstesthasgreaterthanvalue.setText("computezmeanstesthasgreaterthanvalue ");
        computezmeanstesthasgreaterthanvalue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computezmeanstesthasgreaterthanvalueMousePressed(evt);
            }
        });

        computezmeanshaslessthanvaluebutton.setText("computezmeanshaslessthanvalue ");
        computezmeanshaslessthanvaluebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computezmeanshaslessthanvaluebuttonMousePressed(evt);
            }
        });
        computezmeanshaslessthanvaluebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computezmeanshaslessthanvaluebuttonActionPerformed(evt);
            }
        });

        computeSebutton12.setText("computezmeanstesthasnotequaltovalue ");
        computeSebutton12.setToolTipText("");
        computeSebutton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                computeSebutton12MousePressed(evt);
            }
        });
        computeSebutton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeSebutton12ActionPerformed(evt);
            }
        });

        statsoutputlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statsoutputlabel.setText("420");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(integrallowerboundlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(356, 356, 356)
                                .addComponent(integratebutton))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(integralupperboundlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(540, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(deriveoutputlabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(deriveinputlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(deriveinputfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(derivebutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(statsinputdatalabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(deriveoutputvaluelabel))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(integralsymbollabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(computeinputlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(computeinputfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(computeoutputlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(computeoutputvaluelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(computebutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(statsinputdatalabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(statsinputdatalabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(statsinputlabelfield, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statsinputlabelfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(computeSebutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(computesumofresidualssquaredbutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(computeresidualvaluesbutton))
                                    .addComponent(statsinputlabelfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(computeypredictedvaluesbutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(computelsrloutputbutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(displaylsrlequationbutton))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(computeabutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(computebbutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(computerbutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(computersquaredvaluebutton))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(computezprobmidpointriemann)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(computezmeanstesthasgreaterthanvalue))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(computezmeanshaslessthanvaluebutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(computeSebutton12))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(integraloutputlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(statsoutputlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computeinputlabel)
                    .addComponent(computeinputfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(computebutton)
                    .addComponent(statsinputlabelfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statsinputdatalabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(computeoutputlabel)
                        .addComponent(computeoutputvaluelabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(statsinputdatalabel2)
                        .addComponent(statsinputlabelfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deriveinputlabel)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deriveinputfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(derivebutton)
                        .addComponent(statsinputdatalabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(statsinputlabelfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deriveoutputlabel)
                        .addComponent(deriveoutputvaluelabel))
                    .addComponent(computeSebutton)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(computesumofresidualssquaredbutton)
                        .addComponent(computeresidualvaluesbutton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computeypredictedvaluesbutton)
                    .addComponent(computelsrloutputbutton)
                    .addComponent(displaylsrlequationbutton))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(integralupperboundlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(computeabutton)
                        .addComponent(computebbutton)
                        .addComponent(computerbutton)
                        .addComponent(computersquaredvaluebutton)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(computezprobmidpointriemann)
                            .addComponent(computezmeanstesthasgreaterthanvalue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(computezmeanshaslessthanvaluebutton)
                            .addComponent(computeSebutton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(integraloutputlabel)
                            .addComponent(statsoutputlabel))
                        .addGap(150, 150, 150))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(integralsymbollabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(integrallowerboundlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(integratebutton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(darkleftbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(middlebluesection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(topbluebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(topbluebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(middlebluesection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(darkleftbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        computeinputlabel.setVisible(false);
        computeinputfield.setVisible(false);
        computeoutputlabel.setVisible(false);
        computeoutputvaluelabel.setVisible(false);
        computebutton.setVisible(false);
        deriveinputlabel.setVisible(false);
        deriveinputfield.setVisible(false);
        deriveoutputlabel.setVisible(false);
        deriveoutputvaluelabel.setVisible(false);
        derivebutton.setVisible(false);
        integralsymbollabel.setVisible(false);
        integrallowerboundlabel.setVisible(false);
        integralupperboundlabel.setVisible(false);
        integratebutton.setVisible(false);
        integraloutputlabel.setVisible(false);
        statsinputdatalabel.setVisible(false);
        statsinputdatalabel1.setVisible(false);
        statsinputdatalabel2.setVisible(false);
        statsinputlabelfield.setVisible(false);
        statsinputlabelfield1.setVisible(false);
        statsinputlabelfield2.setVisible(false);
        computeSebutton.setVisible(false);
        computesumofresidualssquaredbutton.setVisible(false);
        computeresidualvaluesbutton.setVisible(false);
        computeypredictedvaluesbutton.setVisible(false);
        computelsrloutputbutton.setVisible(false);
        displaylsrlequationbutton.setVisible(false);
        computeabutton.setVisible(false);
        computebbutton.setVisible(false);
        computerbutton.setVisible(false);
        computersquaredvaluebutton.setVisible(false);
        computezprobmidpointriemann.setVisible(false);
        computezmeanstesthasgreaterthanvalue.setVisible(false);
        computezmeanshaslessthanvaluebutton.setVisible(false);
        computeSebutton12.setVisible(false);
        statsoutputlabel.setVisible(false);

        pack();
    } // </editor-fold>                        

    //Home button pressed - Hide everything
    private void sidetab1MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        computeinputlabel.setVisible(false);
        computeinputfield.setVisible(false);
        computeoutputlabel.setVisible(false);
        computeoutputvaluelabel.setVisible(false);
        computebutton.setVisible(false);
        deriveinputlabel.setVisible(false);
        deriveinputfield.setVisible(false);
        deriveoutputlabel.setVisible(false);
        deriveoutputvaluelabel.setVisible(false);
        derivebutton.setVisible(false);
        integralsymbollabel.setVisible(false);
        integrallowerboundlabel.setVisible(false);
        integralupperboundlabel.setVisible(false);
        integratebutton.setVisible(false);
        integraloutputlabel.setVisible(false);
        statsinputdatalabel.setVisible(false);
        statsinputdatalabel1.setVisible(false);
        statsinputdatalabel2.setVisible(false);
        statsinputlabelfield.setVisible(false);
        statsinputlabelfield1.setVisible(false);
        statsinputlabelfield2.setVisible(false);
        computeSebutton.setVisible(false);
        computesumofresidualssquaredbutton.setVisible(false);
        computeresidualvaluesbutton.setVisible(false);
        computeypredictedvaluesbutton.setVisible(false);
        computelsrloutputbutton.setVisible(false);
        displaylsrlequationbutton.setVisible(false);
        computeabutton.setVisible(false);
        computebbutton.setVisible(false);
        computerbutton.setVisible(false);
        computersquaredvaluebutton.setVisible(false);
        computezprobmidpointriemann.setVisible(false);
        computezmeanstesthasgreaterthanvalue.setVisible(false);
        computezmeanshaslessthanvaluebutton.setVisible(false);
        computeSebutton12.setVisible(false);
        statsoutputlabel.setVisible(false);

        setColor(sidetab1);
        javax.swing.JPanel[] jarray = new javax.swing.JPanel[5];
        indicator1.setOpaque(true);
        jarray[0] = sidetab2;
        jarray[1] = sidetab3;
        jarray[2] = sidetab5;
        jarray[3] = sidetab7;
        jarray[4] = sidetab8;
        javax.swing.JPanel[] jarray2 = new javax.swing.JPanel[5];
        jarray2[0] = indicator6;
        jarray2[1] = indicator2;
        jarray2[2] = indicator3;
        jarray2[3] = indicator4;
        jarray2[4] = indicator5;

        resetColor(jarray, jarray2);
    }

    //Compute button pressed - bring up buttons to input value and compute
    private void sidetab2MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        // TODO add your handling code here:
        computeinputlabel.setVisible(true);
        computeinputfield.setVisible(true);
        computeoutputlabel.setVisible(true);
        computeoutputvaluelabel.setVisible(true);
        computebutton.setVisible(true);
        deriveinputlabel.setVisible(false);
        deriveinputfield.setVisible(false);
        deriveoutputlabel.setVisible(false);
        deriveoutputvaluelabel.setVisible(false);
        derivebutton.setVisible(false);
        integralsymbollabel.setVisible(false);
        integrallowerboundlabel.setVisible(false);
        integralupperboundlabel.setVisible(false);
        integratebutton.setVisible(false);
        integraloutputlabel.setVisible(false);
        statsinputdatalabel.setVisible(false);
        statsinputdatalabel1.setVisible(false);
        statsinputdatalabel2.setVisible(false);
        statsinputlabelfield.setVisible(false);
        statsinputlabelfield1.setVisible(false);
        statsinputlabelfield2.setVisible(false);
        computeSebutton.setVisible(false);
        computesumofresidualssquaredbutton.setVisible(false);
        computeresidualvaluesbutton.setVisible(false);
        computeypredictedvaluesbutton.setVisible(false);
        computelsrloutputbutton.setVisible(false);
        displaylsrlequationbutton.setVisible(false);
        computeabutton.setVisible(false);
        computebbutton.setVisible(false);
        computerbutton.setVisible(false);
        computersquaredvaluebutton.setVisible(false);
        computezprobmidpointriemann.setVisible(false);
        computezmeanstesthasgreaterthanvalue.setVisible(false);
        computezmeanshaslessthanvaluebutton.setVisible(false);
        computeSebutton.setVisible(false);
        computeSebutton12.setVisible(false);
        statsoutputlabel.setVisible(false);
        setColor(sidetab2);
        javax.swing.JPanel[] jarray = new javax.swing.JPanel[5];
        indicator2.setOpaque(true);
        jarray[0] = sidetab1;
        jarray[1] = sidetab3;
        jarray[2] = sidetab5;
        jarray[3] = sidetab7;
        jarray[4] = sidetab8;
        javax.swing.JPanel[] jarray2 = new javax.swing.JPanel[5];
        jarray2[0] = indicator1;
        jarray2[1] = indicator6;
        jarray2[2] = indicator3;
        jarray2[3] = indicator4;
        jarray2[4] = indicator5;

        resetColor(jarray, jarray2);
    }

    //Derive button pressed - bring up number input field and buttons
    private void sidetab3MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        computeinputlabel.setVisible(false);
        computeinputfield.setVisible(false);
        computeoutputlabel.setVisible(false);
        computeoutputvaluelabel.setVisible(false);
        computebutton.setVisible(false);
        deriveinputlabel.setVisible(true);
        deriveinputfield.setVisible(true);
        deriveoutputlabel.setVisible(true);
        deriveoutputvaluelabel.setVisible(true);
        derivebutton.setVisible(true);
        integralsymbollabel.setVisible(false);
        integrallowerboundlabel.setVisible(false);
        integralupperboundlabel.setVisible(false);
        integratebutton.setVisible(false);
        integraloutputlabel.setVisible(false);
        statsinputdatalabel.setVisible(false);
        statsinputdatalabel1.setVisible(false);
        statsinputdatalabel2.setVisible(false);
        statsinputlabelfield.setVisible(false);
        statsinputlabelfield1.setVisible(false);
        statsinputlabelfield2.setVisible(false);
        computeSebutton.setVisible(false);
        computesumofresidualssquaredbutton.setVisible(false);
        computeresidualvaluesbutton.setVisible(false);
        computeypredictedvaluesbutton.setVisible(false);
        computelsrloutputbutton.setVisible(false);
        displaylsrlequationbutton.setVisible(false);
        computeabutton.setVisible(false);
        computebbutton.setVisible(false);
        computerbutton.setVisible(false);
        computersquaredvaluebutton.setVisible(false);
        computezprobmidpointriemann.setVisible(false);
        computezmeanstesthasgreaterthanvalue.setVisible(false);
        computezmeanshaslessthanvaluebutton.setVisible(false);
        computeSebutton.setVisible(false);
        computeSebutton12.setVisible(false);
        statsoutputlabel.setVisible(false);
        setColor(sidetab3);
        javax.swing.JPanel[] jarray = new javax.swing.JPanel[5];
        indicator3.setOpaque(true);
        jarray[0] = sidetab1;
        jarray[1] = sidetab2;
        jarray[2] = sidetab5;
        jarray[3] = sidetab7;
        jarray[4] = sidetab8;
        javax.swing.JPanel[] jarray2 = new javax.swing.JPanel[5];
        jarray2[0] = indicator1;
        jarray2[1] = indicator6;
        jarray2[2] = indicator2;
        jarray2[3] = indicator4;
        jarray2[4] = indicator5;

        resetColor(jarray, jarray2);
    }

    //Integrate tab button pressed - bring up integral symbol and input
    private void sidetab5MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        computeinputlabel.setVisible(false);
        computeinputfield.setVisible(false);
        computeoutputlabel.setVisible(false);
        computeoutputvaluelabel.setVisible(false);
        computebutton.setVisible(false);
        deriveinputlabel.setVisible(false);
        deriveinputfield.setVisible(false);
        deriveoutputlabel.setVisible(false);
        deriveoutputvaluelabel.setVisible(false);
        derivebutton.setVisible(false);
        integralsymbollabel.setVisible(true);
        integrallowerboundlabel.setVisible(true);
        integralupperboundlabel.setVisible(true);
        integratebutton.setVisible(true);
        integraloutputlabel.setVisible(true);
        statsinputdatalabel.setVisible(false);
        statsinputdatalabel1.setVisible(false);
        statsinputdatalabel2.setVisible(false);
        statsinputlabelfield.setVisible(false);
        statsinputlabelfield1.setVisible(false);
        statsinputlabelfield2.setVisible(false);
        computeSebutton.setVisible(false);
        computesumofresidualssquaredbutton.setVisible(false);
        computeresidualvaluesbutton.setVisible(false);
        computeypredictedvaluesbutton.setVisible(false);
        computelsrloutputbutton.setVisible(false);
        displaylsrlequationbutton.setVisible(false);
        computeabutton.setVisible(false);
        computebbutton.setVisible(false);
        computerbutton.setVisible(false);
        computersquaredvaluebutton.setVisible(false);
        computezprobmidpointriemann.setVisible(false);
        computezmeanstesthasgreaterthanvalue.setVisible(false);
        computezmeanshaslessthanvaluebutton.setVisible(false);
        computeSebutton.setVisible(false);
        computeSebutton12.setVisible(false);
        statsoutputlabel.setVisible(false);
        setColor(sidetab5);
        javax.swing.JPanel[] jarray = new javax.swing.JPanel[5];
        indicator4.setOpaque(true);
        jarray[0] = sidetab1;
        jarray[1] = sidetab3;
        jarray[2] = sidetab2;
        jarray[3] = sidetab7;
        jarray[4] = sidetab8;
        javax.swing.JPanel[] jarray2 = new javax.swing.JPanel[5];
        jarray2[0] = indicator1;
        jarray2[1] = indicator6;
        jarray2[2] = indicator3;
        jarray2[3] = indicator5;
        jarray2[4] = indicator2;

        resetColor(jarray, jarray2);
    }

    //Graphing tab - Opens new window with the graph
    private void sidetab7MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        computeinputlabel.setVisible(false);
        computeinputfield.setVisible(false);
        computeoutputlabel.setVisible(false);
        computeoutputvaluelabel.setVisible(false);
        computebutton.setVisible(false);
        deriveinputlabel.setVisible(false);
        deriveinputfield.setVisible(false);
        deriveoutputlabel.setVisible(false);
        deriveoutputvaluelabel.setVisible(false);
        derivebutton.setVisible(false);
        integralsymbollabel.setVisible(false);
        integrallowerboundlabel.setVisible(false);
        integralupperboundlabel.setVisible(false);
        integratebutton.setVisible(false);
        integraloutputlabel.setVisible(false);
        statsinputdatalabel.setVisible(false);
        statsinputdatalabel1.setVisible(false);
        statsinputdatalabel2.setVisible(false);
        statsinputlabelfield.setVisible(false);
        statsinputlabelfield1.setVisible(false);
        statsinputlabelfield2.setVisible(false);
        computeSebutton.setVisible(false);
        computesumofresidualssquaredbutton.setVisible(false);
        computeresidualvaluesbutton.setVisible(false);
        computeypredictedvaluesbutton.setVisible(false);
        computelsrloutputbutton.setVisible(false);
        displaylsrlequationbutton.setVisible(false);
        computeabutton.setVisible(false);
        computebbutton.setVisible(false);
        computerbutton.setVisible(false);
        computersquaredvaluebutton.setVisible(false);
        computezprobmidpointriemann.setVisible(false);
        computezmeanstesthasgreaterthanvalue.setVisible(false);
        computezmeanshaslessthanvaluebutton.setVisible(false);
        computeSebutton.setVisible(false);
        computeSebutton12.setVisible(false);
        statsoutputlabel.setVisible(false);

        Graphing graphing = new Graphing(f);

        setColor(sidetab7);
        javax.swing.JPanel[] jarray = new javax.swing.JPanel[5];
        indicator5.setOpaque(true);
        jarray[0] = sidetab1;
        jarray[1] = sidetab3;
        jarray[2] = sidetab5;
        jarray[3] = sidetab2;
        jarray[4] = sidetab8;
        javax.swing.JPanel[] jarray2 = new javax.swing.JPanel[5];
        jarray2[0] = indicator1;
        jarray2[1] = indicator6;
        jarray2[2] = indicator3;
        jarray2[3] = indicator4;
        jarray2[4] = indicator2;

        resetColor(jarray, jarray2);
    }

    //Stats button pressed - bring up all the stats buttons and input rows
    private void sidetab8MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        computeinputlabel.setVisible(false);
        computeinputfield.setVisible(false);
        computeoutputlabel.setVisible(false);
        computeoutputvaluelabel.setVisible(false);
        computebutton.setVisible(false);
        deriveinputlabel.setVisible(false);
        deriveinputfield.setVisible(false);
        deriveoutputlabel.setVisible(false);
        deriveoutputvaluelabel.setVisible(false);
        derivebutton.setVisible(false);
        integralsymbollabel.setVisible(false);
        integrallowerboundlabel.setVisible(false);
        integralupperboundlabel.setVisible(false);
        integratebutton.setVisible(false);
        integraloutputlabel.setVisible(false);
        statsinputdatalabel.setVisible(true);
        statsinputdatalabel1.setVisible(true);
        statsinputdatalabel2.setVisible(true);
        statsinputlabelfield.setVisible(true);
        statsinputlabelfield1.setVisible(true);
        statsinputlabelfield2.setVisible(true);
        computeSebutton.setVisible(true);
        computesumofresidualssquaredbutton.setVisible(true);
        computeresidualvaluesbutton.setVisible(true);
        computeypredictedvaluesbutton.setVisible(true);
        computelsrloutputbutton.setVisible(true);
        displaylsrlequationbutton.setVisible(true);
        computeabutton.setVisible(true);
        computebbutton.setVisible(true);
        computerbutton.setVisible(true);
        computersquaredvaluebutton.setVisible(true);
        computezprobmidpointriemann.setVisible(true);
        computezmeanstesthasgreaterthanvalue.setVisible(true);
        computezmeanshaslessthanvaluebutton.setVisible(true);
        computeSebutton.setVisible(true);
        computeSebutton12.setVisible(true);
        statsoutputlabel.setVisible(true);

        setColor(sidetab8);
        javax.swing.JPanel[] jarray = new javax.swing.JPanel[5];
        indicator6.setOpaque(true);
        jarray[0] = sidetab1;
        jarray[1] = sidetab3;
        jarray[2] = sidetab5;
        jarray[3] = sidetab7;
        jarray[4] = sidetab2;
        javax.swing.JPanel[] jarray2 = new javax.swing.JPanel[5];
        jarray2[0] = indicator1;
        jarray2[1] = indicator2;
        jarray2[2] = indicator3;
        jarray2[3] = indicator4;
        jarray2[4] = indicator5;

        resetColor(jarray, jarray2);
    }

    private void computeinputfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void computebuttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void computebuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        //Get input value from user and set output label to computed value
        try {
            double input = Double.valueOf(computeinputfield.getText());
            computeoutputvaluelabel.setText(Double.toString(f.compute(input)));
        } catch (Exception df) {
            df.printStackTrace();
            computeoutputvaluelabel.setText("Error: Invalid input");
        }
    }

    private void deriveinputfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void derivebuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        //get input value from user and set output label to derivative at that input value
        try {
            double input = Double.valueOf(deriveinputfield.getText());
            deriveoutputvaluelabel.setText(Double.toString(Calculus.computeDerivativeAtAPoint(f, input)));
        } catch (Exception df) {
            deriveoutputvaluelabel.setText("Error: Invalid input");
        }
    }

    private void derivebuttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void integrallowerboundlabelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void integralupperboundlabelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void integratebuttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        //Get user input and integrate from lower to upper bound
        try {
            double lowerBound = Double.valueOf(integrallowerboundlabel.getText());
            double upperBound = Double.valueOf(integralupperboundlabel.getText());

            integraloutputlabel.setText(Double.toString(Calculus.computeDefiniteIntegral(f, lowerBound, upperBound)));
        } catch (Exception df) {
            integraloutputlabel.setText("error");
        }

    }

    private void equationinputfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //Convert input equation to function(and rpn)
        boolean hasequals = false;

        String infix = equationinputfield.getText();

        if (infix.indexOf("=") != -1) {
            //Subtract right side from left side
            String rightside = infix.substring(infix.indexOf("=") + 1);
            String leftside = infix.substring(0, infix.indexOf("="));
            infix = leftside + "- (" + rightside + ")";
            System.out.println(infix);
            hasequals = true;
        }

        String rpn = InfixParser.parse(infix);

        rpnequationoutputlabel.setText(rpn);

        ArrayList < Function > blaze = InfixParser.stringRPNtoList(rpn);

        //blaze = InfixParser.reverseStack(blaze);

        f = InfixParser.RPNCruncher(blaze);


        //f = blaze.pop();

        //Get an array of all the zeros
        ArrayList < Double > zeros1 = new ArrayList < Double > ();
        ArrayList < Double > zeros = new ArrayList < Double > ();

        for (int i = -10000; i <= 10000; i += 2) {
            try {
                zeros1.add(Algebra.bisectionZeros(f, i, i + 2));
            } catch (Exception e) {
                continue;
            }
        }
        for (int i = -10001; i <= 10000; i += 2) {
            try {
                zeros1.add(Algebra.bisectionZeros(f, i, i + 2));
            } catch (Exception e) {
                continue;
            }
        }

        for (int i = 0; i < zeros1.size(); i++) {
            if (!zeros.contains(zeros1.get(i))) {
                zeros.add(zeros1.get(i));
            }
        }

        if (zeros.size() > 0) {
            if (hasequals) {
                jLabel1.setText("Solutions:" + zeros.toString());
            } else {
                jLabel1.setText("Zeros" + zeros.toString());
            }
        } else {
            jLabel1.setText("This function has no zeros");
        }


    }

    private void statsinputlabelfield1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void statsinputlabelfield2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void computezmeanshaslessthanvaluebuttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void computeSebutton12ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void computeSebuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";
        String data2 = statsinputlabelfield2.getText() + ", 0";

        System.out.println(data2);

        ArrayList < Double > array1 = new ArrayList < Double > ();
        ArrayList < Double > array2 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }

        lastindex = 0;
        while (data2.indexOf(",") >= 0) {
            lastindex = data2.indexOf(",");
            String number = data2.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array2.add(d);

            data2 = data2.substring(lastindex + 1);
        }

        double[] arr1 = list_to_arr(array1);
        double[] arr2 = list_to_arr(array2);

        statsoutputlabel.setText(Double.toString(Statistics.computeSe(arr1, arr2)));


    }

    private void computesumofresidualssquaredbuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";
        String data2 = statsinputlabelfield2.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();
        ArrayList < Double > array2 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }

        lastindex = 0;
        while (data2.indexOf(",") >= 0) {
            lastindex = data2.indexOf(",");
            String number = data2.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array2.add(d);

            data2 = data2.substring(lastindex + 1);
        }

        double[] arr1 = list_to_arr(array1);
        double[] arr2 = list_to_arr(array2);

        statsoutputlabel.setText(Double.toString(Statistics.computeSumOfResidualsSquared(arr1, arr2)));
    }

    private void computeresidualvaluesbuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";
        String data2 = statsinputlabelfield2.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();
        ArrayList < Double > array2 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }

        lastindex = 0;
        while (data2.indexOf(",") >= 0) {
            lastindex = data2.indexOf(",");
            String number = data2.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array2.add(d);

            data2 = data2.substring(lastindex + 1);
        }

        double[] arr1 = list_to_arr(array1);
        double[] arr2 = list_to_arr(array2);

        statsoutputlabel.setText(Arrays.toString(Statistics.computeResidualValues(arr1, arr2)));
    }

    private void computeypredictedvaluesbuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";
        String data2 = statsinputlabelfield2.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();
        ArrayList < Double > array2 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }

        lastindex = 0;
        while (data2.indexOf(",") >= 0) {
            lastindex = data2.indexOf(",");
            String number = data2.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array2.add(d);

            data2 = data2.substring(lastindex + 1);
        }

        double[] arr1 = list_to_arr(array1);
        double[] arr2 = list_to_arr(array2);

        statsoutputlabel.setText(Arrays.toString(Statistics.computeYPredictedValues(arr1, arr2)));
    }

    private void computelsrloutputbuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";
        String data2 = statsinputlabelfield2.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();
        ArrayList < Double > array2 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }

        lastindex = 0;
        while (data2.indexOf(",") >= 0) {
            lastindex = data2.indexOf(",");
            String number = data2.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array2.add(d);

            data2 = data2.substring(lastindex + 1);
        }

        double[] arr1 = list_to_arr(array1);
        double[] arr2 = list_to_arr(array2);

        double num = Double.valueOf(statsinputlabelfield1.getText());

        statsoutputlabel.setText(Double.toString(Statistics.computeLSRLOutput(arr1, arr2, num)));
    }

    private void computeabuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";
        String data2 = statsinputlabelfield2.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();
        ArrayList < Double > array2 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }

        lastindex = 0;
        while (data2.indexOf(",") >= 0) {
            lastindex = data2.indexOf(",");
            String number = data2.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array2.add(d);

            data2 = data2.substring(lastindex + 1);
        }

        double[] arr1 = list_to_arr(array1);
        double[] arr2 = list_to_arr(array2);

        statsoutputlabel.setText(Double.toString(Statistics.computeA(arr1, arr2)));
    }

    private void computebbuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";
        String data2 = statsinputlabelfield2.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();
        ArrayList < Double > array2 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }

        lastindex = 0;
        while (data2.indexOf(",") >= 0) {
            lastindex = data2.indexOf(",");
            String number = data2.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array2.add(d);

            data2 = data2.substring(lastindex + 1);
        }

        double[] arr1 = list_to_arr(array1);
        double[] arr2 = list_to_arr(array2);

        statsoutputlabel.setText(Double.toString(Statistics.computeB(arr1, arr2)));
    }

    private void computerbuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";
        String data2 = statsinputlabelfield2.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();
        ArrayList < Double > array2 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }

        lastindex = 0;
        while (data2.indexOf(",") >= 0) {
            lastindex = data2.indexOf(",");
            String number = data2.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array2.add(d);

            data2 = data2.substring(lastindex + 1);
        }

        double[] arr1 = list_to_arr(array1);
        double[] arr2 = list_to_arr(array2);

        statsoutputlabel.setText(Double.toString(Statistics.computeR(arr1, arr2)));
    }

    private void computersquaredvaluebuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";
        String data2 = statsinputlabelfield2.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();
        ArrayList < Double > array2 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }

        lastindex = 0;
        while (data2.indexOf(",") >= 0) {
            lastindex = data2.indexOf(",");
            String number = data2.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array2.add(d);

            data2 = data2.substring(lastindex + 1);
        }

        double[] arr1 = list_to_arr(array1);
        double[] arr2 = list_to_arr(array2);

        statsoutputlabel.setText(Double.toString(Statistics.computeRSquaredValue(arr1, arr2)));
    }

    private void computezprobmidpointriemannMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText();
        String data2 = statsinputlabelfield2.getText();


        double arr1 = Double.valueOf(data1.trim());
        double arr2 = Double.valueOf(data2.trim());

        statsoutputlabel.setText(Double.toString(Statistics.computeZProbMidpointRiemann(arr1, arr2)));
    }

    private void computezmeanstesthasgreaterthanvalueMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }

        System.out.println("done with loop");


        statsoutputlabel.setText(Statistics.computeZMeansTestHaGreaterThanValue(array1.get(0), array1.get(1), array1.get(2), ((int) Math.round(array1.get(3))), array1.get(4)));
    }

    private void computezmeanshaslessthanvaluebuttonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }



        statsoutputlabel.setText(Statistics.computeZMeansTestHaLessThanValue(array1.get(0), array1.get(1), array1.get(2), ((int) Math.round(array1.get(3))), array1.get(4)));
    }

    private void computeSebutton12MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = statsinputlabelfield.getText() + ", 0";


        ArrayList < Double > array1 = new ArrayList < Double > ();

        //Make an array out of the comma separated input
        int lastindex = 0;
        while (data1.indexOf(",") >= 0) {
            lastindex = data1.indexOf(",");
            String number = data1.substring(0, lastindex);

            double d = Double.valueOf(number.trim());
            array1.add(d);

            data1 = data1.substring(lastindex + 1);
        }



        statsoutputlabel.setText(Statistics.computeZMeansTestHaNotEqualToValue(array1.get(0), array1.get(1), array1.get(2), ((int) Math.round(array1.get(3))), array1.get(4)));
    }

    private double[] list_to_arr(ArrayList < Double > arr) {
        double[] array = new double[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }
        return array;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIv3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIv3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIv3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIv3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIv3().setVisible(true);
            }
        });
    }

    //Highlight active tab
    private void setColor(javax.swing.JPanel pane) {
        pane.setBackground(new java.awt.Color(41, 57, 80));
    }

    //dehighlight unactive tabs
    private void resetColor(javax.swing.JPanel[] panes, javax.swing.JPanel[] indicators) {
        for (int i = 0; i < panes.length; i++) {
            panes[i].setBackground(new java.awt.Color(23, 35, 51));
        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton computeSebutton;
    private javax.swing.JButton computeSebutton12;
    private javax.swing.JButton computeabutton;
    private javax.swing.JButton computebbutton;
    private javax.swing.JButton computebutton;
    private javax.swing.JTextField computeinputfield;
    private javax.swing.JLabel computeinputlabel;
    private javax.swing.JLabel computelabel;
    private javax.swing.JLabel computelabel1;
    private javax.swing.JLabel computelabel2;
    private javax.swing.JLabel computelabel3;
    private javax.swing.JLabel computelabel4;
    private javax.swing.JButton computelsrloutputbutton;
    private javax.swing.JLabel computeoutputlabel;
    private javax.swing.JLabel computeoutputvaluelabel;
    private javax.swing.JButton computerbutton;
    private javax.swing.JButton computeresidualvaluesbutton;
    private javax.swing.JButton computersquaredvaluebutton;
    private javax.swing.JButton computesumofresidualssquaredbutton;
    private javax.swing.JButton computeypredictedvaluesbutton;
    private javax.swing.JButton computezmeanshaslessthanvaluebutton;
    private javax.swing.JButton computezmeanstesthasgreaterthanvalue;
    private javax.swing.JButton computezprobmidpointriemann;
    private javax.swing.JPanel darkleftbar;
    private javax.swing.JButton derivebutton;
    private javax.swing.JTextField deriveinputfield;
    private javax.swing.JLabel deriveinputlabel;
    private javax.swing.JLabel deriveoutputlabel;
    private javax.swing.JLabel deriveoutputvaluelabel;
    private javax.swing.JTextArea descriptiontextfield;
    private javax.swing.JButton displaylsrlequationbutton;
    private javax.swing.JTextField equationinputfield;
    private javax.swing.JLabel homelabel;
    private javax.swing.JPanel indicator1;
    private javax.swing.JPanel indicator2;
    private javax.swing.JPanel indicator3;
    private javax.swing.JPanel indicator4;
    private javax.swing.JPanel indicator5;
    private javax.swing.JPanel indicator6;
    private javax.swing.JTextField integrallowerboundlabel;
    private javax.swing.JLabel integraloutputlabel;
    private javax.swing.JLabel integralsymbollabel;
    private javax.swing.JTextField integralupperboundlabel;
    private javax.swing.JButton integratebutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jcaslabel;
    private javax.swing.JPanel middlebluesection;
    private javax.swing.JPanel palebluebar;
    private javax.swing.JPanel palerbluebar;
    private javax.swing.JLabel rpnequationoutputlabel;
    private javax.swing.JLabel rpnlabel;
    private javax.swing.JPanel sidetab1;
    private javax.swing.JPanel sidetab2;
    private javax.swing.JPanel sidetab3;
    private javax.swing.JPanel sidetab5;
    private javax.swing.JLabel statsoutputlabel;
    private javax.swing.JPanel sidetab7;
    private javax.swing.JPanel sidetab8;
    private javax.swing.JLabel statsinputdatalabel;
    private javax.swing.JLabel statsinputdatalabel1;
    private javax.swing.JLabel statsinputdatalabel2;
    private javax.swing.JTextField statsinputlabelfield;
    private javax.swing.JTextField statsinputlabelfield1;
    private javax.swing.JTextField statsinputlabelfield2;
    private javax.swing.JPanel topbluebar;
    private javax.swing.JLabel yourequationlabel;
    private Function f;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}