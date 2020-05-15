
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;


public class NewJFrame extends javax.swing.JFrame {
    //x este un obiect catre ReteteForm care o sa afiseze retetele, cu ajutorul lui x se face legatura intre 
    //interfete
    ReteteForm x=new ReteteForm();
    
    public NewJFrame() {
        initComponents();
        
        //setez dimensiunea imaginii corespunzatoare optiunii 1 pentru "Diabetic"
        diabetImg.setBounds(80, 30, 200, 160);
        ImageIcon diab=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("regim-dieta-diabet.jpg")));
        Image img1=diab.getImage();
        Image img2=img1.getScaledInstance(diabetImg.getWidth(),diabetImg.getHeight(),Image.SCALE_SMOOTH);
        //Image img2=img1.getScaledInstance(300,160,Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        diabetImg.setIcon(i);
        
        //setez dimensiunea imaginii corespunzatoare optiunii 1 pentru "Vegetarian"
        vegetarianImg.setBounds(80, 30, 320, 163);// (coord x, coord y, width, height)
        ImageIcon veg=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("vegeta!!.png")));
        Image img3=veg.getImage();
        Image img4=img3.getScaledInstance(vegetarianImg.getWidth(),vegetarianImg.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon j=new ImageIcon(img4);
        vegetarianImg.setIcon(j);
        
        //setez dimensiunea imaginii corespunzatoare optiunii 1 pentru "Cardiac"
        cardiacImg.setBounds(80, 30, 200, 163);//setez dimensiunea lui cardiacImg(care este jLabel)
        ImageIcon card=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("cardiac.jpg")));
        Image img5=card.getImage();
        Image img6=img5.getScaledInstance(cardiacImg.getWidth(),cardiacImg.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon k=new ImageIcon(img6);
        cardiacImg.setIcon(k);
        
        
        //setez dimensiunea imaginii corespunzatoare optiunii 1 pentru "Doar infometat"
        infometatImg.setBounds(80, 30, 276, 163);
        ImageIcon infom=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("food2.jpg")));
        Image img7=infom.getImage();
        Image img8=img7.getScaledInstance(infometatImg.getWidth(),infometatImg.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon l=new ImageIcon(img8);
        infometatImg.setIcon(l);
        
       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        aragazCheck = new javax.swing.JCheckBox();
        cuptorCheck = new javax.swing.JCheckBox();
        tigaieCheck = new javax.swing.JCheckBox();
        bolCheck = new javax.swing.JCheckBox();
        mixerCheck = new javax.swing.JCheckBox();
        oalaCheck = new javax.swing.JCheckBox();
        telCheck = new javax.swing.JCheckBox();
        blenderCheck = new javax.swing.JCheckBox();
        robotdebucatarieCheck = new javax.swing.JCheckBox();
        formadecopt_tavaCheck = new javax.swing.JCheckBox();
        frigider_congelatorCheck = new javax.swing.JCheckBox();
        storcatordefructeCheck = new javax.swing.JCheckBox();
        vegetarianImg = new javax.swing.JLabel();
        cardiacImg = new javax.swing.JLabel();
        diabetImg = new javax.swing.JLabel();
        infometatImg = new javax.swing.JLabel();
        intervaltimpSlider = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        diabeticRad = new javax.swing.JRadioButton();
        vegetarianRad = new javax.swing.JRadioButton();
        cardiacRad = new javax.swing.JRadioButton();
        niciopreferintaRad = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaingrediente = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        next2Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        minute = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        girl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        aratareteteBtn = new javax.swing.JButton();
        next3Btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        clientNelogat = new javax.swing.JLabel();
        razganditBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(870, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(870, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(870, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(870, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(2194, 553));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        aragazCheck.setBackground(new java.awt.Color(255, 255, 255));
        aragazCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        aragazCheck.setForeground(new java.awt.Color(102, 102, 0));
        aragazCheck.setText("aragaz");
        aragazCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aragazCheckActionPerformed(evt);
            }
        });

        cuptorCheck.setBackground(new java.awt.Color(255, 255, 255));
        cuptorCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        cuptorCheck.setForeground(new java.awt.Color(102, 102, 0));
        cuptorCheck.setText("cuptor");

        tigaieCheck.setBackground(new java.awt.Color(255, 255, 255));
        tigaieCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        tigaieCheck.setForeground(new java.awt.Color(102, 102, 0));
        tigaieCheck.setText("tigaie");

        bolCheck.setBackground(new java.awt.Color(255, 255, 255));
        bolCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bolCheck.setForeground(new java.awt.Color(102, 102, 0));
        bolCheck.setText("bol");

        mixerCheck.setBackground(new java.awt.Color(255, 255, 255));
        mixerCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        mixerCheck.setForeground(new java.awt.Color(102, 102, 0));
        mixerCheck.setText("mixer");
        mixerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixerCheckActionPerformed(evt);
            }
        });

        oalaCheck.setBackground(new java.awt.Color(255, 255, 255));
        oalaCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        oalaCheck.setForeground(new java.awt.Color(102, 102, 0));
        oalaCheck.setText("oala");

        telCheck.setBackground(new java.awt.Color(255, 255, 255));
        telCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        telCheck.setForeground(new java.awt.Color(102, 102, 0));
        telCheck.setText("tel");
        telCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telCheckActionPerformed(evt);
            }
        });

        blenderCheck.setBackground(new java.awt.Color(255, 255, 255));
        blenderCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        blenderCheck.setForeground(new java.awt.Color(102, 102, 0));
        blenderCheck.setText("blender");

        robotdebucatarieCheck.setBackground(new java.awt.Color(255, 255, 255));
        robotdebucatarieCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        robotdebucatarieCheck.setForeground(new java.awt.Color(102, 102, 0));
        robotdebucatarieCheck.setText("robot de bucatarie");
        robotdebucatarieCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robotdebucatarieCheckActionPerformed(evt);
            }
        });

        formadecopt_tavaCheck.setBackground(new java.awt.Color(255, 255, 255));
        formadecopt_tavaCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        formadecopt_tavaCheck.setForeground(new java.awt.Color(102, 102, 0));
        formadecopt_tavaCheck.setText("forma de copt/ tava");

        frigider_congelatorCheck.setBackground(new java.awt.Color(255, 255, 255));
        frigider_congelatorCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        frigider_congelatorCheck.setForeground(new java.awt.Color(102, 102, 0));
        frigider_congelatorCheck.setText("frigider/ congelator");

        storcatordefructeCheck.setBackground(new java.awt.Color(255, 255, 255));
        storcatordefructeCheck.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        storcatordefructeCheck.setForeground(new java.awt.Color(102, 102, 0));
        storcatordefructeCheck.setText("storcator de fructe");
        storcatordefructeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storcatordefrucstorcatordefructeCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuptorCheck)
                    .addComponent(tigaieCheck)
                    .addComponent(bolCheck)
                    .addComponent(mixerCheck)
                    .addComponent(aragazCheck)
                    .addComponent(oalaCheck))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(storcatordefructeCheck)
                    .addComponent(telCheck)
                    .addComponent(frigider_congelatorCheck)
                    .addComponent(formadecopt_tavaCheck)
                    .addComponent(robotdebucatarieCheck)
                    .addComponent(blenderCheck))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aragazCheck)
                    .addComponent(telCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuptorCheck)
                    .addComponent(blenderCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tigaieCheck)
                    .addComponent(robotdebucatarieCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bolCheck)
                    .addComponent(formadecopt_tavaCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mixerCheck)
                    .addComponent(frigider_congelatorCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oalaCheck)
                    .addComponent(storcatordefructeCheck)))
        );

        vegetarianImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vegeta!!.png"))); // NOI18N
        vegetarianImg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        cardiacImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardiac.jpg"))); // NOI18N

        diabetImg.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        diabetImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/regim-dieta-diabet.jpg"))); // NOI18N
        diabetImg.setText("jLabel7");
        diabetImg.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        infometatImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food2.jpg"))); // NOI18N

        intervaltimpSlider.setBackground(new java.awt.Color(255, 255, 255));
        intervaltimpSlider.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        intervaltimpSlider.setForeground(new java.awt.Color(0, 204, 204));
        intervaltimpSlider.setMajorTickSpacing(15);
        intervaltimpSlider.setMaximum(150);
        intervaltimpSlider.setMinimum(10);
        intervaltimpSlider.setMinorTickSpacing(5);
        intervaltimpSlider.setPaintLabels(true);
        intervaltimpSlider.setPaintTicks(true);
        intervaltimpSlider.setValue(0);
        intervaltimpSlider.setMinimumSize(new java.awt.Dimension(36, 46));
        intervaltimpSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                intervaltimpSliderStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        diabeticRad.setBackground(new java.awt.Color(255, 255, 255));
        diabeticRad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        diabeticRad.setForeground(new java.awt.Color(153, 0, 153));
        diabeticRad.setText("Diabetic");
        diabeticRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diabeticRadActionPerformed(evt);
            }
        });

        vegetarianRad.setBackground(new java.awt.Color(255, 255, 255));
        vegetarianRad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        vegetarianRad.setForeground(new java.awt.Color(153, 0, 153));
        vegetarianRad.setText("Vegetarian");
        vegetarianRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegetarianRadActionPerformed(evt);
            }
        });

        cardiacRad.setBackground(new java.awt.Color(255, 255, 255));
        cardiacRad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        cardiacRad.setForeground(new java.awt.Color(153, 0, 153));
        cardiacRad.setText("Cardiac");
        cardiacRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardiacRadActionPerformed(evt);
            }
        });

        niciopreferintaRad.setBackground(new java.awt.Color(255, 255, 255));
        niciopreferintaRad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        niciopreferintaRad.setForeground(new java.awt.Color(153, 0, 153));
        niciopreferintaRad.setText("Doar infometaaat");
        niciopreferintaRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niciopreferintaRadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Urdu Typesetting", 1, 15)); // NOI18N
        jLabel4.setText("1. Esti ...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardiacRad)
                    .addComponent(vegetarianRad)
                    .addComponent(diabeticRad)
                    .addComponent(niciopreferintaRad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diabeticRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vegetarianRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardiacRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(niciopreferintaRad))
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBar(null);

        listaingrediente.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        listaingrediente.setForeground(new java.awt.Color(0, 0, 102));
        listaingrediente.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "ciocolata", "frisca", "oua", "faina", "zahar", "afine", "aluat fraged cu unt", "alune/nuci/fistic", "apa", "ardei galben", "ardei gras", "ardei iute", "ardei kapia", "avocado", "bacon", "bagheta", "banane", "biscuiti digestivi", "biscuiti populari", "boabe de fasole", "boia dulce", "branza dulce", "branza feta", "branza tip Cheddar", "bulion", "cacao", "cafea", "capsuni", "carne de curcan", "carne de miel", "carne de pui", "cartofi", "cascaval", "castravete", "ceapa", "chimen", "chips din lipie integrala", "ciuperci", "coacaze", "conserva", "crap", "dovlecei", "esenta de vanilie", "esenta portocale", "esenta rom", "faina", "file de cod", "fistic", "foaie de dafin", "frunze mixte de salata", "fulgi de ciocolata", "gem de fructe de padure", "iaurt", "lamaie", "lapte", "leustean", "lipii", "marar", "margarina", "mascarpone", "masline", "mere", "miere", "morcov", "mozzarella", "mure", "mustar de Djon", "oregano", "otet", "ou fiert", "oua", "parmezan", "patrunjel", "pesmet", "pesto", "piept de pui", "piersici", "piper", "praf de copt", "prune", "radacini de albitura", "ricotta", "rosii cherry", "rosii uscate in ulei de masline", "salata", "sare", "scortisoara", "seminte de fenicul", "smantana", "somon", "sos chilli picant", "sos soia", "spanac", "stiuca", "suc de portocale", "taitei chinezesti", "telina", "tortilla", "ulei", "ulei de masline", "ulei de susan", "unt topit", "urzici", "usturoi", "varza tocata", "vin alb", "vinete", "zahar pudra", "zmeura", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaingrediente.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(listaingrediente);
        listaingrediente.setVisible(false);

        jLabel3.setFont(new java.awt.Font("Urdu Typesetting", 1, 15)); // NOI18N
        jLabel3.setText("2. Ingredientele  principale...");

        next2Btn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        next2Btn.setForeground(new java.awt.Color(153, 153, 0));
        next2Btn.setText("Next ->");
        next2Btn.setBorderPainted(false);
        next2Btn.setContentAreaFilled(false);
        next2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2BtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("10");
        jLabel1.setToolTipText("");

        minute.setFont(new java.awt.Font("Urdu Typesetting", 1, 15)); // NOI18N
        minute.setText("min");
        minute.setToolTipText("");
        minute.setBorder(null);
        minute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minuteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText(" Ce bunatati pregatesti astazi?");

        jLabel6.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Sunt Chef Alice si te voi ajuta sa prepari delicatese inedite.");

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText(" Am cateva sugestii pentru tine; ce spui?");

        nextBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        nextBtn.setForeground(new java.awt.Color(153, 153, 0));
        nextBtn.setText("Next ->");
        nextBtn.setBorderPainted(false);
        nextBtn.setContentAreaFilled(false);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Urdu Typesetting", 1, 15)); // NOI18N
        jLabel7.setText("3.Timpul maxim disponibil :");

        girl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/girl.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Urdu Typesetting", 1, 15)); // NOI18N
        jLabel8.setText("4.Vei  folosi...");

        aratareteteBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 9)); // NOI18N
        aratareteteBtn.setForeground(new java.awt.Color(153, 153, 0));
        aratareteteBtn.setText("Arata Retete ->");
        aratareteteBtn.setBorderPainted(false);
        aratareteteBtn.setContentAreaFilled(false);
        aratareteteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aratareteteBtnMouseClicked(evt);
            }
        });
        aratareteteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aratareteteBtnActionPerformed(evt);
            }
        });

        next3Btn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        next3Btn.setForeground(new java.awt.Color(153, 153, 0));
        next3Btn.setText("Next ->");
        next3Btn.setBorderPainted(false);
        next3Btn.setContentAreaFilled(false);
        next3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next3BtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("AngsanaUPC", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Sa incepem!");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 0, 0), null));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));

        razganditBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 9)); // NOI18N
        razganditBtn.setForeground(new java.awt.Color(153, 153, 0));
        razganditBtn.setText("<- M-am razgandit");
        razganditBtn.setBorderPainted(false);
        razganditBtn.setContentAreaFilled(false);
        razganditBtn.setPreferredSize(new java.awt.Dimension(126, 25));
        razganditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razganditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(201, 201, 201)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addComponent(girl, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(next3Btn))
                                            .addComponent(intervaltimpSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(85, 85, 85)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(razganditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(aratareteteBtn))
                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nextBtn)
                                        .addGap(146, 146, 146)
                                        .addComponent(next2Btn)))
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(354, 354, 354)))
                        .addComponent(diabetImg, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardiacImg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infometatImg, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vegetarianImg))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(clientNelogat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(girl, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nextBtn)
                                    .addComponent(next2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(infometatImg, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diabetImg, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cardiacImg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel1)
                                            .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)
                                        .addComponent(intervaltimpSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(next3Btn))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(aratareteteBtn)
                                            .addComponent(razganditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(vegetarianImg, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientNelogat)
                .addContainerGap())
        );

        jPanel3.setVisible(false);
        vegetarianImg.setVisible(false);
        cardiacImg.setVisible(false);
        diabetImg.setVisible(false);
        infometatImg.setVisible(false);
        intervaltimpSlider.setVisible(false);
        jPanel1.setVisible(false);
        jScrollPane1.setVisible(false);
        jLabel3.setVisible(false);
        next2Btn.setVisible(false);
        jLabel1.setVisible(false);
        minute.setVisible(false);
        jLabel2.setVisible(false);
        jLabel6.setVisible(false);
        jLabel5.setVisible(false);
        nextBtn.setVisible(false);
        jLabel7.setVisible(false);
        jLabel2.setVisible(true);
        jLabel6.setVisible(true);
        jLabel5.setVisible(true);
        jLabel8.setVisible(false);
        aratareteteBtn.setVisible(false);
        next3Btn.setVisible(false);
        razganditBtn.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        nextBtn.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
//functie care se apeleaza cand apas pe un buton de next si vreau sa trec in stadiul imediat urmator al
//interfetei
    private void next3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next3BtnActionPerformed
        intervaltimpSlider.setEnabled(false);
         next3Btn.setVisible(false);       
        razganditBtn.setVisible(true);
     
            jLabel8.setVisible(true);
            jPanel3.setVisible(true);
            aratareteteBtn.setVisible(true);

  
    }//GEN-LAST:event_next3BtnActionPerformed
//Functia de mai jos se apeleaza cand se apasa pe butonul:"Arata Retete"
//bag ustensilele intr-o lista
    private void aratareteteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aratareteteBtnActionPerformed

             //daca nu a selectat nicio ustensila (isSelected()= true, daca butonul e selectat )
      if(!aragazCheck.isSelected()&&!cuptorCheck.isSelected()&&!tigaieCheck.isSelected()&&!storcatordefructeCheck.isSelected()&&
                !bolCheck.isSelected()&&!mixerCheck.isSelected()&&!blenderCheck.isSelected()&&!oalaCheck.isSelected()&&
                    !robotdebucatarieCheck.isSelected()&&!formadecopt_tavaCheck.isSelected()&&!frigider_congelatorCheck.isSelected()&&!telCheck.isSelected())
                        JOptionPane.showMessageDialog(this,"Selectati cel putin o optiune!");

//dupa ce apasa 'Arata retete' nu mai poate selecta alte ingrediente
       aragazCheck.setEnabled(false);
       cuptorCheck.setEnabled(false);
       tigaieCheck.setEnabled(false);
       bolCheck.setEnabled(false);
       mixerCheck.setEnabled(false);
       blenderCheck.setEnabled(false);
       robotdebucatarieCheck.setEnabled(false);
       formadecopt_tavaCheck.setEnabled(false);
       frigider_congelatorCheck.setEnabled(false);
       telCheck.setEnabled(false);
       oalaCheck.setEnabled(false);
       storcatordefructeCheck.setEnabled(false);
       
       //adaug ustensilele selectate in lista de ustensile pentru a le putea folosi la afisarea retetelor
       String lista_ustensile=new String("");
       if(aragazCheck.isSelected())
            lista_ustensile=lista_ustensile+aragazCheck.getText()+",";
       if(cuptorCheck.isSelected())
            lista_ustensile=lista_ustensile+cuptorCheck.getText()+",";
       if(tigaieCheck.isSelected())
             lista_ustensile=lista_ustensile+tigaieCheck.getText()+",";
       if(bolCheck.isSelected())       
             lista_ustensile=lista_ustensile+bolCheck.getText()+",";
       if(mixerCheck.isSelected())       
            lista_ustensile=lista_ustensile+mixerCheck.getText()+",";
       if(blenderCheck.isSelected())        
            lista_ustensile=lista_ustensile+blenderCheck.getText()+",";
       if(robotdebucatarieCheck.isSelected())        
            lista_ustensile=lista_ustensile+robotdebucatarieCheck.getText()+",";
      if(formadecopt_tavaCheck.isSelected())        
             lista_ustensile=lista_ustensile+formadecopt_tavaCheck.getText()+",";
       if(frigider_congelatorCheck.isSelected())       
             lista_ustensile=lista_ustensile+frigider_congelatorCheck.getText()+",";
       if(storcatordefructeCheck.isSelected())        
             lista_ustensile=lista_ustensile+storcatordefructeCheck.getText()+",";
       if(oalaCheck.isSelected())       
             lista_ustensile=lista_ustensile+storcatordefructeCheck.getText()+",";
       if(telCheck.isSelected())        
             lista_ustensile=lista_ustensile+telCheck.getText()+",";
     
      //trimit lista de ingrediente catre pagina in care se vor afisa retetele (ReteForm)
      x.setUstensile(lista_ustensile);
      x.jLabelUstensile.setVisible(false);

    }//GEN-LAST:event_aratareteteBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed

        //daca nu a selectat un tip
        if(!diabeticRad.isSelected() && !vegetarianRad.isSelected() && !cardiacRad.isSelected() &&
                !niciopreferintaRad.isSelected()) 
        JOptionPane.showMessageDialog(this,"Nu ati selectat!");
        //daca a selecat tipul
        else
        {
        
            nextBtn.setVisible(false);
            listaingrediente.setVisible(true);
            jLabel3.setVisible(true);
            jScrollPane1.setVisible(true);
            next2Btn.setVisible(true);

            if (diabeticRad.isSelected()&& !vegetarianRad.isSelected() && !cardiacRad.isSelected() &&
                    !niciopreferintaRad.isSelected())
                 diabeticRad.setForeground(Color.green);//tipul ales se coloreaza in verde
            if (cardiacRad.isSelected()&& !vegetarianRad.isSelected() && !diabeticRad.isSelected() &&
                    !niciopreferintaRad.isSelected())
                cardiacRad.setForeground(Color.green);//tipul ales se coloreaza in verde
            if (vegetarianRad.isSelected()&& !diabeticRad.isSelected() && !cardiacRad.isSelected() &&
                    !niciopreferintaRad.isSelected())
                vegetarianRad.setForeground(Color.green);//tipul ales se coloreaza in verde         
            if (niciopreferintaRad.isSelected()&& !vegetarianRad.isSelected() && !cardiacRad.isSelected() &&
                    !diabeticRad.isSelected())
                niciopreferintaRad.setForeground(Color.green);//tipul ales se coloreaza in verde
          
            diabeticRad.setEnabled(false);
            cardiacRad.setEnabled(false);
            vegetarianRad.setEnabled(false);
            niciopreferintaRad.setEnabled(false);
        }

    }//GEN-LAST:event_nextBtnActionPerformed
//functie care se apeleaza cand apas pe un buton de next si vreau sa trec in stadiul imediat urmator al
//interfetei
    private void next2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2BtnActionPerformed
     
            //dispar imaginile corespunzatoare optiunii 1
            //pt a face loc criteriilor urmatoare
            
            vegetarianImg.setVisible(false);
            cardiacImg.setVisible(false);
            infometatImg.setVisible(false);
            diabetImg.setVisible(false);
        
            if(listaingrediente.isSelectionEmpty()) //daca nu am selectat nimic din lista de ingrediente
             JOptionPane.showMessageDialog(this,"Nu ati selectat!");
        else{
            
            //apare criteriul de selectie numarul 3( alegerea timpului)    
                next2Btn.setVisible(false);
                jLabel7.setVisible(true);
                jLabel1.setVisible(true);
                minute.setVisible(true);
                intervaltimpSlider.setVisible(true);
                next3Btn.setVisible(true);
            
             // pun ingredientele selectate intr-un StringBuilder (va avea forma: [ingr1,ingr2,ingr3,...]
                StringBuilder lista_ingrediente=new StringBuilder(""); 
                lista_ingrediente.append(listaingrediente.getSelectedValuesList());
               
                lista_ingrediente.delete(0,1);//sterg '['
                lista_ingrediente.delete(lista_ingrediente.length()-1,lista_ingrediente.length());//sterg ']'
               
                listaingrediente.setEnabled(false); //dupa ce apasa Next, nu mai poate modifica ingredientele alese
                String l=new String(lista_ingrediente);
                //trimit lista de ingrediente catre pagina in care se vor afisa retetele (ReteForm)
                x.setIngrediente(l);
                x.jLabelIngrediente.setVisible(false);//ca sa nu apara
                
        }
    }//GEN-LAST:event_next2BtnActionPerformed

    private void niciopreferintaRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niciopreferintaRadActionPerformed
        
        if (niciopreferintaRad.isSelected()) //daca acest buton e selectat
        {
            vegetarianRad.setSelected(false); //NU poate fi selectat
            cardiacRad.setSelected(false); // -||-
            diabeticRad.setSelected(false);
            
            //ascund celelalte imagini atunci cand utilizatorul isi schimba preferinta
            vegetarianImg.setVisible(false);
            cardiacImg.setVisible(false);
            diabetImg.setVisible(false);
            
            // apare doar imaginea corespunzatoare preferintei lui
            infometatImg.setVisible(true);
        }
    }//GEN-LAST:event_niciopreferintaRadActionPerformed

    private void cardiacRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardiacRadActionPerformed
  
        if (cardiacRad.isSelected()) //daca e selectat acest buton=> celelalte NU mai pot fi selectate
        {
            vegetarianRad.setSelected(false); //NU poate fi selectat
            diabeticRad.setSelected(false); // -||-
            niciopreferintaRad.setSelected(false);

            //ascund celelalte imagini atunci cand utilizatorul isi schimba preferinta
            vegetarianImg.setVisible(false);
            diabetImg.setVisible(false);
            infometatImg.setVisible(false);

            // apare doar imaginea corespunzatoare preferintei lui
            cardiacImg.setVisible(true);
        }
    }//GEN-LAST:event_cardiacRadActionPerformed

    private void vegetarianRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegetarianRadActionPerformed
        
        if (vegetarianRad.isSelected()) //daca e selectat acest buton=> celelalte NU mai pot fi selectate
        { 
            diabeticRad.setSelected(false); //NU poate fi selectat
            cardiacRad.setSelected(false); // -||-
            niciopreferintaRad.setSelected(false);

            //ascund celelalte imagini atunci cand utilizatorul isi schimba preferinta
            diabetImg.setVisible(false);
            cardiacImg.setVisible(false);
            infometatImg.setVisible(false);

            // apare doar imaginea corespunzatoare preferintei lui
            vegetarianImg.setVisible(true);
        } 
    }//GEN-LAST:event_vegetarianRadActionPerformed

    private void diabeticRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diabeticRadActionPerformed
      
        if (diabeticRad.isSelected()) //daca e selectat acest buton=> celelalte NU mai pot fi selectate
        {
                vegetarianRad.setSelected(false); //NU poate fi selectat
                cardiacRad.setSelected(false); // -||-
                niciopreferintaRad.setSelected(false);
                
                //ascund celelalte imagini atunci cand utilizatorul isi schimba preferinta
                vegetarianImg.setVisible(false);
                cardiacImg.setVisible(false);
                infometatImg.setVisible(false);
                
                // apare doar imaginea conform preferintei lui
                diabetImg.setVisible(true);
        }
    }//GEN-LAST:event_diabeticRadActionPerformed

    private void intervaltimpSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_intervaltimpSliderStateChanged
        jLabel1.setText(Integer.toString(intervaltimpSlider.getValue()));

    }//GEN-LAST:event_intervaltimpSliderStateChanged

    private void aratareteteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aratareteteBtnMouseClicked
     //FARA ASTA NU SE VEDE NIMIC in RETETEFORM!!!!!!!!!!!!!!!!!
       x.setVisible(true);
       x.pack();
       x.setLocationRelativeTo(null);
       x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();//ca sa dispara Loginformu-ul din spate
  
       //Vrem sa vedem daca utilizatorul este logat sau nu=>ca sa stim cate retete "aratam" utilizatorului
      if(clientNelogat.getText().equals("clicked"))//daca utilizatorul nu e logat=>arat mai putine retete
      {
       
          int contor=0;//in acest contor tin nr de retete pe care vreau sa le afisez   
          int timp=Integer.parseInt(jLabel1.getText());
          
        try
        {
        Connection conn=null;
        conn=DriverManager.getConnection("jdbc:mysql://localhost/database_try","root","");
        //System.out.println("connected2");
        String query="";///query trebuie neaparat declarata aici, altfel=>EROARE!!!
        
        if(diabeticRad.isSelected()==true) 
             query="SELECT * from retete_d WHERE timp_preparare<=?";
        else if(vegetarianRad.isSelected()) 
            query="SELECT * from retete_v WHERE timp_preparare<=?";
        
        else if(cardiacRad.isSelected()) 
            query="SELECT * from retete_c WHERE timp_preparare<=?";
        
        else if(niciopreferintaRad.isSelected()) 
             query="SELECT * from retete_tot WHERE timp_preparare<=?";
       
        
        
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs;
           
        ps.setInt(1,timp);
        rs=ps.executeQuery();
        int ok=0;
        x.retete.setText(null);
        while(rs.next()==true&&contor<2)
            {  
            ///iau ustensilele 
            String ustensile_client=x.getUstensile();
            if(!ustensile_client.contains(","))
            ustensile_client+=",";//in caz ca este selectat doar 1 ustensila,adaug "," ca sa pot face split
            
            String[]ustensile_clientf=ustensile_client.split(",");///deoarece in lista mea am si spatiu!!!!!=>trebuie sa scap de el!!
            String str2=rs.getString("ustensile");
            str2+=","; //sa pot aplica split() in caz ca am 1 singura ustensila
            String[]ustensile_bd=str2.split(",");
             

            
           ///iau ingredientele
            String ingrediente_client=x.getIngrediente().toString();
             if(!ingrediente_client.contains(","))
            ingrediente_client+=",";//in caz ca este selectat doar 1 ustensila,adaug "," ca sa pot face split
             
            String[]ingrediente_clientf=ingrediente_client.split(", ");///deoarece in lista mea am si spatiu!!!!!=>trebuie sa scap de el!!
            String str=rs.getString("ingrediente");
            String[]ingrediente_bd=str.split(",");
          
            int c=0;
            for(int i=0;i<ingrediente_clientf.length;i++)
            {
                    //System.out.println("ingredient client: "+ingrediente_clientf[i]+"\n");
                for(int j=0;j<ingrediente_bd.length;j++)
                {
                    if( ingrediente_clientf[i].equals(ingrediente_bd[j])||str.contains(ingrediente_clientf[i]))
                    {  
                    c++;
                  
                    }
                }
                
            }
           
            if(c>=ingrediente_bd.length)///daca ingredientele corespund, trebuie sa verific ca si ustensilele corespund
            {
                x.retete.setVisible(true);
             
              
                ///verific daca ustensilele corespund:
                int c2=0;
                for(int i=0;i<ustensile_clientf.length;i++)
                    {
                        // System.out.println("ingredient client: "+ingrediente_clientf[i]+"\n");
                         for(int j=0;j<ustensile_bd.length;j++)
                            {
                                 String[]ustensile_clientf2=ustensile_clientf[i].split("/ ");
                              //   System.out.println(ustensile_clientf2.length);
                                ///pt frigider/ congelator
                                //frigider=ustensile_clientf2[0]
                               
                                if(ustensile_clientf[i].equals(ustensile_bd[j])||ustensile_clientf2[0].equals(ustensile_bd[j]))
                                    {  
                                        c2++;
                  
                                    }
                               
                            }
                
                    }
                
                ///daca ustensilele corespund
                 if(c2>=ustensile_bd.length)
                 {
                     ok=1;
                     x.retete.setVisible(true);
                     //x.retete.append("INGREDIENTE : \n\n"+rs.getString("ingrediente")+" \n\n");
                     //x.retete.append("USTENSILE : \n\n"+rs.getString("ustensile")+" \n\n");
                    
                     //x.retete.append("  "+rs.getString("titlu").toUpperCase()+
                      //       " : \n\n"+rs.getString("mod_preparare")+" \n\n");
                       x.retete.append("           "+rs.getString("titlu").toUpperCase()+"  \n\n"+"Ingrediente: "+
                             rs.getString("ingrediente")+"\n"+"Ustensile: "+rs.getString("ustensile")+" \n\n"+
                             "Mod de preparare: "+rs.getString("mod_preparare")+" \n\n");
                      
                     contor++;
                 
                 }
            }
            
           }
            
            if(ok==0)///daca nu am gasit nicio reteta in BD care sa corespunda timpului introdus de utilizator
            {
                      x.retete.append("Nu exista retete corespunzatoare");
                      //daca nu sunt retete corespunzatoare, bucatarul spune acest lucru
                      x.dialogjLabel.setVisible(false); 
                      x.dinpacatejLabel.setVisible(true);
            }


            conn.close();
            }catch(SQLException e){System.err.println(e);}  
           
      }
      
      
      else //daca utilizatorul e logat
      {
         
        
          int timp=Integer.parseInt(jLabel1.getText());
          
        try
        {
        Connection conn=null;
        conn=DriverManager.getConnection("jdbc:mysql://localhost/database_try","root","");
        //System.out.println("connected2");
        String query="";///query trebuie neaparat declarata aici, altfel=>EROARE!!!
        if(diabeticRad.isSelected()==true) 
            query="SELECT * from retete_d WHERE timp_preparare<=?";
        
        else if(vegetarianRad.isSelected()) 
            query="SELECT * from retete_v WHERE timp_preparare<=?";
        
        else if(cardiacRad.isSelected()) 
            query="SELECT * from retete_c WHERE timp_preparare<=?";
       
        else if(niciopreferintaRad.isSelected()) 
            query="SELECT * from retete_tot WHERE timp_preparare<=?";
        
        
        
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs;
           
        ps.setInt(1,timp);
        rs=ps.executeQuery();
        int ok=0;
        x.retete.setText(null);
        while(rs.next()==true)
            {  
            ///iau ustensilele 
            String ustensile_client=x.getUstensile();
            if(!ustensile_client.contains(","))
                 ustensile_client+=","; //in caz ca este selectat doar 1 ustensila,adaug "," ca sa pot face split
            String[]ustensile_clientf=ustensile_client.split(",");///deoarece in lista mea am si spatiu!!!!!=>trebuie sa scap de el!!
           
            
            String str2=rs.getString("ustensile");
            if(!str2.contains(","))
                 str2+=","; //in caz ca este selectat doar 1 ustensila,adaug "," ca sa pot face split
            String[]ustensile_bd=str2.split(",");
          
            
           ///iau ingredientele
            String ingrediente_client=x.getIngrediente().toString();
            if(!ingrediente_client.contains(","))
                ingrediente_client+=",";//in caz ca este selectat doar 1 ingredient,adaug "," ca sa pot face split
            
            String[]ingrediente_clientf=ingrediente_client.split(", ");///deoarece in lista mea am si spatiu!!!!!=>trebuie sa scap de el!!
            String str=rs.getString("ingrediente");
            String[]ingrediente_bd=str.split(",");
          
            int c=0;
            for(int i=0;i<ingrediente_clientf.length;i++)
            {
                   
                for(int j=0;j<ingrediente_bd.length;j++)
                {
                    if( ingrediente_clientf[i].equals(ingrediente_bd[j])||str.contains(ingrediente_clientf[i]))
                    {  
                    c++;
                  
                    }
                }
                
            }
           
            if(c>=ingrediente_bd.length)///daca ingredientele corespund, trebuie sa verific ca si ustensilele corespund
            {
                
                x.retete.setVisible(true);
              
                ///verific daca ustensilele corespund:
                int c2=0;
                for(int i=0;i<ustensile_clientf.length;i++)
                    {  String[]ustensile_clientf2=ustensile_clientf[i].split("/ ");
                        // System.out.println("ingredient client: "+ingrediente_clientf[i]+"\n");
                         for(int j=0;j<ustensile_bd.length;j++)
                            {  
                                if(ustensile_clientf[i].equals(ustensile_bd[j])||ustensile_clientf2[0].equals(ustensile_bd[j]))
                                    {  
                                        c2++;
                  
                                    }
                            }
                
                    }
                ///daca ustensilele corespund
                 if(c2>=ustensile_bd.length)
                 {
                     ok=1;
                     x.retete.setVisible(true);
                  
                     x.retete.append("           "+rs.getString("titlu").toUpperCase()+"  \n\n"+"Ingrediente: "+
                             rs.getString("ingrediente")+"\n"+"Ustensile: "+rs.getString("ustensile")+" \n\n"+
                             "Mod de preparare: "+rs.getString("mod_preparare")+" \n\n");
           
                 }
          
            }
            
           }
             
        if(ok==0)///daca nu am gasit nicio reteta in BD care sa corespunda timpului introdus de utilizator
        {
                  x.retete.append("Nu exista retete corespunzatoare");
                   //daca nu sunt retete corespunzatoare, bucatarul spune acest lucru
                      x.dialogjLabel.setVisible(false); 
                      x.dinpacatejLabel.setVisible(true);
        }
     
              
        conn.close();
        }catch(SQLException e){System.err.println(e);}  
           
      }
       
       

    }//GEN-LAST:event_aratareteteBtnMouseClicked

    private void storcatordefrucstorcatordefructeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storcatordefrucstorcatordefructeCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storcatordefrucstorcatordefructeCheckActionPerformed

    private void robotdebucatarieCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robotdebucatarieCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_robotdebucatarieCheckActionPerformed

    private void telCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telCheckActionPerformed

    private void mixerCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixerCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mixerCheckActionPerformed

    private void aragazCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aragazCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aragazCheckActionPerformed
//Functia de mai jos se apeleaza cand se apasa pe butonul: M-am razgandit si are rolul de a duce interfata
//la stadiul de inceput al interfetei, respectiv acela in care trebuie sa alegem din nou ingredient, timp de
//de preparare +etcc.
    private void razganditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razganditBtnActionPerformed
        // TODO add your handling code here:
        jScrollPane1.setVisible(false);
        aratareteteBtn.setVisible(false);
        jLabel8.setVisible(false);
        aragazCheck.setEnabled(true);
        cuptorCheck.setEnabled(true);
        tigaieCheck.setEnabled(true);
        bolCheck.setEnabled(true);
        mixerCheck.setEnabled(true);
        oalaCheck.setEnabled(true);
        telCheck.setEnabled(true);
        blenderCheck.setEnabled(true);
        robotdebucatarieCheck.setEnabled(true);
        formadecopt_tavaCheck.setEnabled(true);
        frigider_congelatorCheck.setEnabled(true);
        storcatordefructeCheck.setEnabled(true);
        jPanel3.setVisible(false);
        razganditBtn.setVisible(false);
        
        aragazCheck.setForeground(new java.awt.Color(102, 102, 0));
        cuptorCheck.setForeground(new java.awt.Color(102, 102, 0));
        tigaieCheck.setForeground(new java.awt.Color(102, 102, 0));
        bolCheck.setForeground(new java.awt.Color(102, 102, 0));
        mixerCheck.setForeground(new java.awt.Color(102, 102, 0));
        oalaCheck.setForeground(new java.awt.Color(102, 102, 0));
        telCheck.setForeground(new java.awt.Color(102, 102, 0));
        blenderCheck.setForeground(new java.awt.Color(102, 102, 0));
        robotdebucatarieCheck.setForeground(new java.awt.Color(102, 102, 0));
        formadecopt_tavaCheck.setForeground(new java.awt.Color(102, 102, 0));
        frigider_congelatorCheck.setForeground(new java.awt.Color(102, 102, 0));
        storcatordefructeCheck.setForeground(new java.awt.Color(102, 102, 0));
        
        aragazCheck.setSelected(false);
        cuptorCheck.setSelected(false);
        tigaieCheck.setSelected(false);
        bolCheck.setSelected(false);
        mixerCheck.setSelected(false);
        oalaCheck.setSelected(false);
        telCheck.setSelected(false);
        blenderCheck.setSelected(false);
        robotdebucatarieCheck.setSelected(false);
        formadecopt_tavaCheck.setSelected(false);
        frigider_congelatorCheck.setSelected(false);
        storcatordefructeCheck.setSelected(false);
                
        
        //aragazCheck.set
        
        jLabel7.setVisible(false);
        jLabel1.setVisible(false);
        minute.setVisible(false);
        next3Btn.setVisible(false);
        intervaltimpSlider.setValue(10);
        intervaltimpSlider.setEnabled(true);
        intervaltimpSlider.setVisible(false);
        
        //listaingrediente.setVisible(false);
        listaingrediente.setEnabled(true);
       // listaingrediente.setSelectedIndex(0);
        jLabel3.setVisible(false);
        next2Btn.setVisible(false);
        //next2Btn.setSelected(0);
        listaingrediente.setSelectedIndex(0);
        listaingrediente.setVisible(false);
        
        
        
        diabeticRad.setEnabled(true);
        vegetarianRad.setEnabled(true);
        cardiacRad.setEnabled(true);
        niciopreferintaRad.setEnabled(true);
        vegetarianRad.setForeground(new java.awt.Color(153, 0, 153));
        cardiacRad.setForeground(new java.awt.Color(153, 0, 153));
        diabeticRad.setForeground(new java.awt.Color(153, 0, 153));
        niciopreferintaRad.setForeground(new java.awt.Color(153, 0, 153));
        nextBtn.setVisible(true);
        diabeticRad.setSelected(false);
        vegetarianRad.setSelected(false);
        cardiacRad.setSelected(false);
        niciopreferintaRad.setSelected(false);
      
       
    }//GEN-LAST:event_razganditBtnActionPerformed

    private void minuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minuteActionPerformed
 
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        
        //NewJFrame frame=new NewJFrame();
        //frame.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aragazCheck;
    private javax.swing.JButton aratareteteBtn;
    private javax.swing.JCheckBox blenderCheck;
    private javax.swing.JCheckBox bolCheck;
    private javax.swing.JLabel cardiacImg;
    private javax.swing.JRadioButton cardiacRad;
    public javax.swing.JLabel clientNelogat;
    private javax.swing.JCheckBox cuptorCheck;
    private javax.swing.JLabel diabetImg;
    private javax.swing.JRadioButton diabeticRad;
    private javax.swing.JCheckBox formadecopt_tavaCheck;
    private javax.swing.JCheckBox frigider_congelatorCheck;
    private javax.swing.JLabel girl;
    private javax.swing.JLabel infometatImg;
    private javax.swing.JSlider intervaltimpSlider;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaingrediente;
    private javax.swing.JTextField minute;
    private javax.swing.JCheckBox mixerCheck;
    private javax.swing.JButton next2Btn;
    private javax.swing.JButton next3Btn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JRadioButton niciopreferintaRad;
    private javax.swing.JCheckBox oalaCheck;
    private javax.swing.JButton razganditBtn;
    private javax.swing.JCheckBox robotdebucatarieCheck;
    private javax.swing.JCheckBox storcatordefructeCheck;
    private javax.swing.JCheckBox telCheck;
    private javax.swing.JCheckBox tigaieCheck;
    private javax.swing.JLabel vegetarianImg;
    private javax.swing.JRadioButton vegetarianRad;
    // End of variables declaration//GEN-END:variables
}
