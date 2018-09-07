/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Alunos extends javax.swing.JInternalFrame {

    public Alunos() {
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        alTable.getParent().setBackground(new Color(233, 231, 233));
        alTable.getTableHeader().setBackground(new Color(233, 231, 233));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabAlPesquisar = new javax.swing.JLabel();
        tabAlCadastro = new javax.swing.JLabel();
        tabAlNovo = new javax.swing.JLabel();
        viewAl = new javax.swing.JPanel();
        viewAlPesquisar = new javax.swing.JPanel();
        alSearchBar = new javax.swing.JPanel();
        searchID = new javax.swing.JTextField();
        searchNome = new javax.swing.JTextField();
        searchIcon = new javax.swing.JLabel();
        separatorSearch = new javax.swing.JSeparator();
        searchFilter = new javax.swing.JComboBox<>();
        searchSeta = new javax.swing.JLabel();
        searchFilterText = new javax.swing.JTextField();
        searchIconFilter = new javax.swing.JLabel();
        scrollTable = new javax.swing.JScrollPane();
        alTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(233, 231, 233));
        setBorder(null);
        setMaximizable(true);
        setResizable(true);
        setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(233, 231, 233));

        tabAlPesquisar.setBackground(new java.awt.Color(9, 122, 96));
        tabAlPesquisar.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        tabAlPesquisar.setForeground(new java.awt.Color(233, 231, 233));
        tabAlPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tabAlPesquisar.setText("Pesquisar");
        tabAlPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabAlPesquisar.setOpaque(true);

        tabAlCadastro.setBackground(new java.awt.Color(255, 254, 255));
        tabAlCadastro.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        tabAlCadastro.setForeground(new java.awt.Color(47, 49, 54));
        tabAlCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tabAlCadastro.setText("Cadastro");
        tabAlCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabAlCadastro.setOpaque(true);

        tabAlNovo.setBackground(new java.awt.Color(255, 254, 255));
        tabAlNovo.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        tabAlNovo.setForeground(new java.awt.Color(47, 49, 54));
        tabAlNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tabAlNovo.setText("Novo");
        tabAlNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabAlNovo.setOpaque(true);

        viewAl.setBackground(new java.awt.Color(233, 231, 233));

        viewAlPesquisar.setBackground(new java.awt.Color(233, 231, 233));

        alSearchBar.setBackground(new java.awt.Color(47, 49, 54));

        searchID.setBackground(new java.awt.Color(255, 254, 255));
        searchID.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        searchID.setForeground(new java.awt.Color(47, 49, 54));
        searchID.setBorder(null);

        searchNome.setBackground(new java.awt.Color(255, 254, 255));
        searchNome.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        searchNome.setForeground(new java.awt.Color(47, 49, 54));
        searchNome.setBorder(null);

        searchIcon.setBackground(new java.awt.Color(9, 122, 96));
        searchIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/Search_25px.png"))); // NOI18N
        searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchIcon.setMaximumSize(new java.awt.Dimension(27, 27));
        searchIcon.setMinimumSize(new java.awt.Dimension(27, 27));
        searchIcon.setOpaque(true);
        searchIcon.setPreferredSize(new java.awt.Dimension(27, 27));

        separatorSearch.setOrientation(javax.swing.SwingConstants.VERTICAL);

        searchFilter.setBackground(new java.awt.Color(255, 254, 255));
        searchFilter.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        searchFilter.setForeground(new java.awt.Color(47, 49, 54));
        searchFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        searchFilter.setBorder(null);

        searchSeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/Seta_25px.png"))); // NOI18N

        searchFilterText.setBackground(new java.awt.Color(255, 254, 255));
        searchFilterText.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        searchFilterText.setForeground(new java.awt.Color(47, 49, 54));
        searchFilterText.setBorder(null);

        searchIconFilter.setBackground(new java.awt.Color(9, 122, 96));
        searchIconFilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchIconFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main/Search_25px.png"))); // NOI18N
        searchIconFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchIconFilter.setMaximumSize(new java.awt.Dimension(27, 27));
        searchIconFilter.setMinimumSize(new java.awt.Dimension(27, 27));
        searchIconFilter.setOpaque(true);
        searchIconFilter.setPreferredSize(new java.awt.Dimension(27, 27));

        javax.swing.GroupLayout alSearchBarLayout = new javax.swing.GroupLayout(alSearchBar);
        alSearchBar.setLayout(alSearchBarLayout);
        alSearchBarLayout.setHorizontalGroup(
            alSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alSearchBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchNome, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separatorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(searchSeta)
                .addGap(0, 0, 0)
                .addComponent(searchFilterText, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(searchIconFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        alSearchBarLayout.setVerticalGroup(
            alSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alSearchBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchIconFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(separatorSearch)
                    .addComponent(searchIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchID)
                    .addComponent(searchNome)
                    .addComponent(searchFilter)
                    .addComponent(searchSeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchFilterText))
                .addContainerGap())
        );

        scrollTable.setBackground(new java.awt.Color(233, 231, 233));
        scrollTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 231, 233), 0));
        scrollTable.setForeground(new java.awt.Color(233, 231, 233));

        alTable.setBackground(new java.awt.Color(255, 254, 255));
        alTable.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        alTable.setForeground(new java.awt.Color(47, 49, 54));
        alTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Curso", "Turma", "Horário", "Responsável"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        alTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        alTable.setAutoscrolls(false);
        alTable.setGridColor(new java.awt.Color(240, 240, 240));
        alTable.setRowHeight(22);
        alTable.setSelectionBackground(new java.awt.Color(9, 122, 96));
        alTable.setSelectionForeground(new java.awt.Color(255, 254, 255));
        alTable.setShowVerticalLines(false);
        scrollTable.setViewportView(alTable);
        if (alTable.getColumnModel().getColumnCount() > 0) {
            alTable.getColumnModel().getColumn(1).setPreferredWidth(230);
            alTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            alTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            alTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            alTable.getColumnModel().getColumn(5).setPreferredWidth(230);
        }

        javax.swing.GroupLayout viewAlPesquisarLayout = new javax.swing.GroupLayout(viewAlPesquisar);
        viewAlPesquisar.setLayout(viewAlPesquisarLayout);
        viewAlPesquisarLayout.setHorizontalGroup(
            viewAlPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAlPesquisarLayout.createSequentialGroup()
                .addComponent(alSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(scrollTable)
        );
        viewAlPesquisarLayout.setVerticalGroup(
            viewAlPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAlPesquisarLayout.createSequentialGroup()
                .addComponent(alSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout viewAlLayout = new javax.swing.GroupLayout(viewAl);
        viewAl.setLayout(viewAlLayout);
        viewAlLayout.setHorizontalGroup(
            viewAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewAlPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        viewAlLayout.setVerticalGroup(
            viewAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewAlPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tabAlPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabAlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabAlNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(584, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tabAlPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabAlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabAlNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alSearchBar;
    private javax.swing.JTable alTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JComboBox<String> searchFilter;
    private javax.swing.JTextField searchFilterText;
    private javax.swing.JTextField searchID;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JLabel searchIconFilter;
    private javax.swing.JTextField searchNome;
    private javax.swing.JLabel searchSeta;
    private javax.swing.JSeparator separatorSearch;
    private javax.swing.JLabel tabAlCadastro;
    private javax.swing.JLabel tabAlNovo;
    private javax.swing.JLabel tabAlPesquisar;
    private javax.swing.JPanel viewAl;
    private javax.swing.JPanel viewAlPesquisar;
    // End of variables declaration//GEN-END:variables
}
