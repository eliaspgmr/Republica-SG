/**
 * Tela Principal da Aplicação
 * Comtém classe principal
 * @name Republica-SG
 * @version 1.0 beta 
 * @author Elias
 */
package view;
//imports
import core.Session;
import java.awt.Color;


public class Principal extends javax.swing.JFrame {
    //Objects and variables
    private OptionPane op = new OptionPane(this,true);
    private Alunos alunos = new Alunos();
    private Financeiro financeiro = new Financeiro();
    private Relatorios relatorios = new Relatorios();
    private Configuration configuration = new Configuration();
    private Usuarios usuarios = new Usuarios();
    private int activeMenuItem = 1;
    Login log;
    //Construtor
    public Principal(Login l) {
        initComponents();
        openAlunos();
        log = l;
    }
    public void setInfor(){
        mainWelcome.setText("Bem vindo - "+Session.getUserNome());
        infUsuarioR.setText(Session.getUser());
        infUserDB.setText(Session.getServerUser());
        infPort.setText(Session.getGate());
        infServidorR.setText(Session.getServer());
        //mainDate.setText(System.getProperty("date"));
    }
    private void openAlunos(){
        //Abre a janela alunos
        if(!alunos.isVisible()){
            closeWindows();
            alunos.setSize(desktop.getSize());
            desktop.add(alunos);
            alunos.setVisible(true); 
        }
    }
    private void openFinanceiro(){
        //Abre a janela financeiro
        if(!financeiro.isVisible()){
            closeWindows();
            financeiro.setSize(desktop.getSize());
            desktop.add(financeiro);
            financeiro.setVisible(true); 
        }
    }
    private void openRelatorios(){
        //Abre a janela relatorios
        if(!relatorios.isVisible()){
            closeWindows();
            relatorios.setSize(desktop.getSize()); 
            desktop.add(relatorios);
            relatorios.setVisible(true); 
        }
    }
    private void openConfiguration(){
        //Abre a janela configuration
        if(!configuration.isVisible()){
            closeWindows();
            configuration.setSize(desktop.getSize());
            desktop.add(configuration);
            configuration.setVisible(true); 
        }
    }
    private void openUsuarios(){
        //Abre a janela usuarios
        if(!usuarios.isVisible()){
            closeWindows();
            usuarios.setSize(desktop.getSize());
            desktop.add(usuarios);
            usuarios.setVisible(true);
        }
    }
    private void closeWindows(){
        //fecha a janela que estiver aberta no desktop
        if(alunos.isVisible()){
            desktop.remove(alunos);
            alunos.dispose();
        }
        if(financeiro.isVisible()){
            desktop.remove(financeiro);
            financeiro.dispose();
        }
        if(relatorios.isVisible()){
            desktop.remove(relatorios);
            relatorios.dispose();
        }
        if(configuration.isVisible()){
            desktop.remove(configuration);
            configuration.dispose();
        }
        if(usuarios.isVisible()){
            desktop.remove(usuarios);
            usuarios.dispose();
        }
    }
    
    private void resetColorMenu(){
        menuAlunos.setBackground(new Color(57, 60, 64));
        menuFinanceiro.setBackground(new Color(57, 60, 64));
        menuRelatorios.setBackground(new Color(57, 60, 64));
        menuConfiguracoes.setBackground(new Color(57, 60, 64));
        menuUsuarios.setBackground(new Color(57, 60, 64));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitleBar = new javax.swing.JPanel();
        mainLogo = new javax.swing.JLabel();
        mainTittleIcon = new javax.swing.JLabel();
        mainTitle = new javax.swing.JLabel();
        mainTitleSeparator = new javax.swing.JSeparator();
        mainDate = new javax.swing.JLabel();
        mainWelcome = new javax.swing.JLabel();
        mainControlPanel = new javax.swing.JPanel();
        mainMenu = new javax.swing.JPanel();
        menuAlunos = new javax.swing.JPanel();
        iconMenuAlunos = new javax.swing.JLabel();
        menuFinanceiro = new javax.swing.JPanel();
        iconMenuFinanceiro = new javax.swing.JLabel();
        menuRelatorios = new javax.swing.JPanel();
        iconMenuRelatorios = new javax.swing.JLabel();
        menuConfiguracoes = new javax.swing.JPanel();
        iconMenuConfiguracoes = new javax.swing.JLabel();
        menuUsuarios = new javax.swing.JPanel();
        iconMenuUsuarios = new javax.swing.JLabel();
        mainInformacoes = new javax.swing.JPanel();
        infUsuario = new javax.swing.JLabel();
        infCargo = new javax.swing.JLabel();
        infDB = new javax.swing.JLabel();
        infServidor = new javax.swing.JLabel();
        infUsuarioR = new javax.swing.JLabel();
        infUserDB = new javax.swing.JLabel();
        infPort = new javax.swing.JLabel();
        infServidorR = new javax.swing.JLabel();
        mainSair = new javax.swing.JPanel();
        mainSairIcon = new javax.swing.JLabel();
        menuSobre = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(233, 231, 233));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        mainTitleBar.setBackground(new java.awt.Color(255, 254, 255));

        mainLogo.setBackground(new java.awt.Color(9, 122, 96));
        mainLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo-Republica-SG.png"))); // NOI18N
        mainLogo.setOpaque(true);

        mainTittleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/Student_30px.png"))); // NOI18N

        mainTitle.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(57, 60, 64));
        mainTitle.setText("Alunos");

        mainTitleSeparator.setBackground(new java.awt.Color(233, 231, 233));
        mainTitleSeparator.setForeground(new java.awt.Color(233, 231, 233));
        mainTitleSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainTitleSeparator.setOpaque(true);

        mainDate.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        mainDate.setForeground(new java.awt.Color(57, 60, 64));
        mainDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainDate.setText("18 Junho 2017");

        mainWelcome.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        mainWelcome.setForeground(new java.awt.Color(47, 49, 54));
        mainWelcome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout mainTitleBarLayout = new javax.swing.GroupLayout(mainTitleBar);
        mainTitleBar.setLayout(mainTitleBarLayout);
        mainTitleBarLayout.setHorizontalGroup(
            mainTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTitleBarLayout.createSequentialGroup()
                .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainTittleIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(mainTitleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        mainTitleBarLayout.setVerticalGroup(
            mainTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainTitleSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(mainTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainTitleBarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(mainWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(mainDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainTittleIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainControlPanel.setBackground(new java.awt.Color(47, 49, 54));

        mainMenu.setBackground(new java.awt.Color(57, 60, 64));

        menuAlunos.setBackground(new java.awt.Color(9, 122, 96));
        menuAlunos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAlunosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAlunosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAlunosMouseExited(evt);
            }
        });

        iconMenuAlunos.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        iconMenuAlunos.setForeground(new java.awt.Color(233, 231, 233));
        iconMenuAlunos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iconMenuAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/Student_25px.png"))); // NOI18N
        iconMenuAlunos.setText("   Alunos");
        iconMenuAlunos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout menuAlunosLayout = new javax.swing.GroupLayout(menuAlunos);
        menuAlunos.setLayout(menuAlunosLayout);
        menuAlunosLayout.setHorizontalGroup(
            menuAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAlunosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(iconMenuAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuAlunosLayout.setVerticalGroup(
            menuAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconMenuAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuFinanceiro.setBackground(new java.awt.Color(57, 60, 64));
        menuFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFinanceiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuFinanceiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuFinanceiroMouseExited(evt);
            }
        });

        iconMenuFinanceiro.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        iconMenuFinanceiro.setForeground(new java.awt.Color(233, 231, 233));
        iconMenuFinanceiro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iconMenuFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/Money_25px.png"))); // NOI18N
        iconMenuFinanceiro.setText("   Financeiro");
        iconMenuFinanceiro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout menuFinanceiroLayout = new javax.swing.GroupLayout(menuFinanceiro);
        menuFinanceiro.setLayout(menuFinanceiroLayout);
        menuFinanceiroLayout.setHorizontalGroup(
            menuFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuFinanceiroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(iconMenuFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        menuFinanceiroLayout.setVerticalGroup(
            menuFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuFinanceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconMenuFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuRelatorios.setBackground(new java.awt.Color(57, 60, 64));
        menuRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRelatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuRelatoriosMouseExited(evt);
            }
        });

        iconMenuRelatorios.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        iconMenuRelatorios.setForeground(new java.awt.Color(233, 231, 233));
        iconMenuRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iconMenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/Report_25px.png"))); // NOI18N
        iconMenuRelatorios.setText("   Relatórios");
        iconMenuRelatorios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout menuRelatoriosLayout = new javax.swing.GroupLayout(menuRelatorios);
        menuRelatorios.setLayout(menuRelatoriosLayout);
        menuRelatoriosLayout.setHorizontalGroup(
            menuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuRelatoriosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(iconMenuRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuRelatoriosLayout.setVerticalGroup(
            menuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconMenuRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuConfiguracoes.setBackground(new java.awt.Color(57, 60, 64));
        menuConfiguracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuConfiguracoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuConfiguracoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuConfiguracoesMouseExited(evt);
            }
        });

        iconMenuConfiguracoes.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        iconMenuConfiguracoes.setForeground(new java.awt.Color(233, 231, 233));
        iconMenuConfiguracoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iconMenuConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/Settings_25px.png"))); // NOI18N
        iconMenuConfiguracoes.setText("   Configurações");
        iconMenuConfiguracoes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout menuConfiguracoesLayout = new javax.swing.GroupLayout(menuConfiguracoes);
        menuConfiguracoes.setLayout(menuConfiguracoesLayout);
        menuConfiguracoesLayout.setHorizontalGroup(
            menuConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuConfiguracoesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(iconMenuConfiguracoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuConfiguracoesLayout.setVerticalGroup(
            menuConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconMenuConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuUsuarios.setBackground(new java.awt.Color(57, 60, 64));
        menuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuUsuariosMouseExited(evt);
            }
        });

        iconMenuUsuarios.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        iconMenuUsuarios.setForeground(new java.awt.Color(233, 231, 233));
        iconMenuUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iconMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/User_25px.png"))); // NOI18N
        iconMenuUsuarios.setText("   Usuários");
        iconMenuUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout menuUsuariosLayout = new javax.swing.GroupLayout(menuUsuarios);
        menuUsuarios.setLayout(menuUsuariosLayout);
        menuUsuariosLayout.setHorizontalGroup(
            menuUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUsuariosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(iconMenuUsuarios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuUsuariosLayout.setVerticalGroup(
            menuUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconMenuUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addComponent(menuAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainInformacoes.setBackground(new java.awt.Color(57, 60, 64));

        infUsuario.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        infUsuario.setForeground(new java.awt.Color(233, 231, 233));
        infUsuario.setText("Usuário:");

        infCargo.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        infCargo.setForeground(new java.awt.Color(233, 231, 233));
        infCargo.setText("UsuárioDB:");

        infDB.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        infDB.setForeground(new java.awt.Color(233, 231, 233));
        infDB.setText("Porta:");

        infServidor.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        infServidor.setForeground(new java.awt.Color(233, 231, 233));
        infServidor.setText("Servidor:");

        infUsuarioR.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        infUsuarioR.setForeground(new java.awt.Color(233, 231, 233));

        infUserDB.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        infUserDB.setForeground(new java.awt.Color(233, 231, 233));

        infPort.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        infPort.setForeground(new java.awt.Color(233, 231, 233));

        infServidorR.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        infServidorR.setForeground(new java.awt.Color(233, 231, 233));

        mainSair.setBackground(new java.awt.Color(199, 77, 76));
        mainSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainSairMouseExited(evt);
            }
        });

        mainSairIcon.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        mainSairIcon.setForeground(new java.awt.Color(233, 231, 233));
        mainSairIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/Sair_30px.png"))); // NOI18N
        mainSairIcon.setText("    Sair");

        javax.swing.GroupLayout mainSairLayout = new javax.swing.GroupLayout(mainSair);
        mainSair.setLayout(mainSairLayout);
        mainSairLayout.setHorizontalGroup(
            mainSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainSairLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainSairIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainSairLayout.setVerticalGroup(
            mainSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainSairIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainInformacoesLayout = new javax.swing.GroupLayout(mainInformacoes);
        mainInformacoes.setLayout(mainInformacoesLayout);
        mainInformacoesLayout.setHorizontalGroup(
            mainInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainInformacoesLayout.createSequentialGroup()
                        .addComponent(infUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infUsuarioR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainInformacoesLayout.createSequentialGroup()
                        .addComponent(infCargo)
                        .addGap(4, 4, 4)
                        .addComponent(infUserDB, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                    .addGroup(mainInformacoesLayout.createSequentialGroup()
                        .addComponent(infDB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainInformacoesLayout.createSequentialGroup()
                        .addComponent(infServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infServidorR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainInformacoesLayout.setVerticalGroup(
            mainInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infUsuario)
                    .addComponent(infUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infCargo)
                    .addComponent(infUserDB, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infDB)
                    .addComponent(infPort, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infServidor)
                    .addComponent(infServidorR, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(mainSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuSobre.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        menuSobre.setForeground(new java.awt.Color(233, 231, 233));
        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/Info_30px.png"))); // NOI18N
        menuSobre.setText("  Sobre");
        menuSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout mainControlPanelLayout = new javax.swing.GroupLayout(mainControlPanel);
        mainControlPanel.setLayout(mainControlPanelLayout);
        mainControlPanelLayout.setHorizontalGroup(
            mainControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainInformacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainControlPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(menuSobre)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainControlPanelLayout.setVerticalGroup(
            mainControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(menuSobre)
                .addGap(19, 19, 19))
        );

        desktop.setBackground(new java.awt.Color(233, 231, 233));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desktop))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktop)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //<editor-fold defaultstate="collapsed" desc="Efeito Hover do Menu">

    private void menuFinanceiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFinanceiroMouseEntered
        //Evento de passar o mouse no menu
        if(activeMenuItem!=2){
            menuFinanceiro.setBackground(new Color(47, 49, 54));
        }
    }//GEN-LAST:event_menuFinanceiroMouseEntered

    private void menuFinanceiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFinanceiroMouseExited
        //Evento de tirar o mouse no menu
        if(activeMenuItem!=2){
           menuFinanceiro.setBackground(new Color(57, 60, 64));
        }
    }//GEN-LAST:event_menuFinanceiroMouseExited

    private void menuAlunosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlunosMouseEntered
        //Evento de passar o mouse no menu
        if(activeMenuItem!=1){
           menuAlunos.setBackground(new Color(47, 49, 54));
        }
    }//GEN-LAST:event_menuAlunosMouseEntered

    private void menuAlunosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlunosMouseExited
        //Evento de tirar o mouse no menu
        if(activeMenuItem!=1){
           menuAlunos.setBackground(new Color(57, 60, 64));
        }
    }//GEN-LAST:event_menuAlunosMouseExited

    private void menuRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRelatoriosMouseEntered
        //Evento de passar o mouse no menu
        if(activeMenuItem!=3){
           menuRelatorios.setBackground(new Color(47, 49, 54));
        }
    }//GEN-LAST:event_menuRelatoriosMouseEntered

    private void menuRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRelatoriosMouseExited
        //Evento de passar o mouse no menu
        if(activeMenuItem!=3){
           menuRelatorios.setBackground(new Color(57, 60, 64));
        }
    }//GEN-LAST:event_menuRelatoriosMouseExited

    private void menuConfiguracoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConfiguracoesMouseEntered
        //Evento de passar o mouse no menu
        if(activeMenuItem!=4){
           menuConfiguracoes.setBackground(new Color(47, 49, 54));
        }
    }//GEN-LAST:event_menuConfiguracoesMouseEntered

    private void menuConfiguracoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConfiguracoesMouseExited
        //Evento de passar o mouse no menu
        if(activeMenuItem!=4){
           menuConfiguracoes.setBackground(new Color(57, 60, 64));
        }
    }//GEN-LAST:event_menuConfiguracoesMouseExited

    private void menuUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuariosMouseEntered
        //Evento de passar o mouse no menu
        if(activeMenuItem!=5){
           menuUsuarios.setBackground(new Color(47, 49, 54));
        }
    }//GEN-LAST:event_menuUsuariosMouseEntered

    private void menuUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuariosMouseExited
        //Evento de passar o mouse no menu
        if(activeMenuItem!=5){
           menuUsuarios.setBackground(new Color(57, 60, 64));
        }
    }//GEN-LAST:event_menuUsuariosMouseExited
    //</editor-fold>
    private void menuAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlunosMouseClicked
        //Clique no Item de Menu
        resetColorMenu();
        activeMenuItem = 1;
        menuAlunos.setBackground(new Color(9, 122, 96));
        openAlunos();
    }//GEN-LAST:event_menuAlunosMouseClicked

    private void menuFinanceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFinanceiroMouseClicked
        //Clique no Item de Menu
        resetColorMenu();
        activeMenuItem = 2;
        menuFinanceiro.setBackground(new Color(9, 122, 96));
        openFinanceiro();
    }//GEN-LAST:event_menuFinanceiroMouseClicked

    private void menuRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRelatoriosMouseClicked
        //Clique no Item de Menu
        resetColorMenu();
        activeMenuItem = 3;
        menuRelatorios.setBackground(new Color(9, 122, 96));
        openRelatorios();
    }//GEN-LAST:event_menuRelatoriosMouseClicked

    private void menuConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConfiguracoesMouseClicked
        //Clique no Item de Menu
        resetColorMenu();
        activeMenuItem = 4;
        menuConfiguracoes.setBackground(new Color(9, 122, 96));
        openConfiguration();
    }//GEN-LAST:event_menuConfiguracoesMouseClicked

    private void menuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuariosMouseClicked
        //Clique no Item de Menu
        resetColorMenu();
        activeMenuItem = 5;
        menuUsuarios.setBackground(new Color(9, 122, 96));
        openUsuarios();
    }//GEN-LAST:event_menuUsuariosMouseClicked

    private void mainSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainSairMouseEntered
        mainSair.setBackground(new Color(132, 51, 50));
    }//GEN-LAST:event_mainSairMouseEntered

    private void mainSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainSairMouseExited
        mainSair.setBackground(new Color(199, 77, 76));
    }//GEN-LAST:event_mainSairMouseExited

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if(alunos.isVisible()){
            alunos.setSize(desktop.getSize());
        }
        if(financeiro.isVisible()){
            financeiro.setSize(desktop.getSize());
        }
        if(relatorios.isVisible()){
            relatorios.setSize(desktop.getSize());
        }
        if(configuration.isVisible()){
            configuration.setSize(desktop.getSize());
        }
        if(usuarios.isVisible()){
            usuarios.setSize(desktop.getSize());
        }
    }//GEN-LAST:event_formComponentResized

    private void mainSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainSairMouseClicked
        Session.close();
        log.setVisible(true);
        this.dispose();
        mainSair.setBackground(new Color(199, 77, 76));
    }//GEN-LAST:event_mainSairMouseClicked
    
    public void main() {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
       
        OptionPane opm = new OptionPane(this,true);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                opm.showQuestion("Deseja sair do SG?");
                if(opm.getValue()){
                    System.exit(0);
                }
            }
        });   
    }
       
    
    
    //<editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel iconMenuAlunos;
    private javax.swing.JLabel iconMenuConfiguracoes;
    private javax.swing.JLabel iconMenuFinanceiro;
    private javax.swing.JLabel iconMenuRelatorios;
    private javax.swing.JLabel iconMenuUsuarios;
    private javax.swing.JLabel infCargo;
    private javax.swing.JLabel infDB;
    private javax.swing.JLabel infPort;
    private javax.swing.JLabel infServidor;
    private javax.swing.JLabel infServidorR;
    private javax.swing.JLabel infUserDB;
    private javax.swing.JLabel infUsuario;
    private javax.swing.JLabel infUsuarioR;
    private javax.swing.JPanel mainControlPanel;
    private javax.swing.JLabel mainDate;
    private javax.swing.JPanel mainInformacoes;
    private javax.swing.JLabel mainLogo;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel mainSair;
    private javax.swing.JLabel mainSairIcon;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JPanel mainTitleBar;
    private javax.swing.JSeparator mainTitleSeparator;
    private javax.swing.JLabel mainTittleIcon;
    private javax.swing.JLabel mainWelcome;
    private javax.swing.JPanel menuAlunos;
    private javax.swing.JPanel menuConfiguracoes;
    private javax.swing.JPanel menuFinanceiro;
    private javax.swing.JPanel menuRelatorios;
    private javax.swing.JLabel menuSobre;
    private javax.swing.JPanel menuUsuarios;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
