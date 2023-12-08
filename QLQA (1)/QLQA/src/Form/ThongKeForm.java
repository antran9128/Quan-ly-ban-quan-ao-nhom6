
package Form;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.DanhMuc;
import model.ThongKeSanPham;
import service.ThongKeService;


public class ThongKeForm extends javax.swing.JPanel {
    private ThongKeService thongKeService = new ThongKeService();
    
    public ThongKeForm() {
        initComponents();
        initDanhMuc();
        initSanPhamTable();
        thongKeDoanhThu();
    }
    
    
    public void initDanhMuc(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboDanhMuc.getModel();
        for (DanhMuc danhMuc : thongKeService.getAllDanhMuc()) {
            model.addElement(danhMuc.getTenDanhMuc());
        }
    }
    
    public void initSanPhamTable(){
        DefaultTableModel model = (DefaultTableModel) tblTKSP.getModel();
        model.setRowCount(0);
        for (ThongKeSanPham tksp : thongKeService.getAllThongKeSanPham()) {
            model.addRow(tksp.toDataRow());
        }
    }
    
    public void thongKeDoanhThu(){
        lbTheoNgay.setText(thongKeService.thongKeTheoNgay() + " $");
        lbTheoThang.setText(thongKeService.thongKeTheoThang() + " $");
        lbTheoNam.setText(thongKeService.thongKeTheoNam() + " $");
    }
    
    public void tuyChon(){
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        String tuNgay = dcn.format(dcTuNgay1.getDate());
        String denNgay = dcn.format(dcDenNgay1.getDate());
        
        double dt = thongKeService.locDoanhThu(tuNgay, denNgay);
        lbTuyChon.setText(dt+" $");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelTK1 = new view.PanelTK();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        panelTK5 = new view.PanelTK();
        panelTK4 = new view.PanelTK();
        panelTK3 = new view.PanelTK();
        panelTK2 = new view.PanelTK();
        jLabel17 = new javax.swing.JLabel();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnThongKe = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTKSP = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboDanhMuc = new javax.swing.JComboBox<>();
        cboTrangThai = new javax.swing.JComboBox<>();
        btnLoc = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        panelTK9 = new view.PanelTK();
        jLabel10 = new javax.swing.JLabel();
        lbTheoNgay = new javax.swing.JLabel();
        panelTK8 = new view.PanelTK();
        jLabel12 = new javax.swing.JLabel();
        lbTheoThang = new javax.swing.JLabel();
        panelTK7 = new view.PanelTK();
        jLabel14 = new javax.swing.JLabel();
        lbTheoNam = new javax.swing.JLabel();
        panelTK6 = new view.PanelTK();
        jLabel16 = new javax.swing.JLabel();
        lbTuyChon = new javax.swing.JLabel();
        dcTuNgay1 = new com.toedter.calendar.JDateChooser();
        dcDenNgay1 = new com.toedter.calendar.JDateChooser();
        dcTuNgay2 = new com.toedter.calendar.JDateChooser();
        dcDenNgay2 = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("THONG KE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTK1Layout = new javax.swing.GroupLayout(panelTK1);
        panelTK1.setLayout(panelTK1Layout);
        panelTK1Layout.setHorizontalGroup(
            panelTK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        panelTK1Layout.setVerticalGroup(
            panelTK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(140, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(140, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(140, 100));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTK5Layout = new javax.swing.GroupLayout(panelTK5);
        panelTK5.setLayout(panelTK5Layout);
        panelTK5Layout.setHorizontalGroup(
            panelTK5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        panelTK5Layout.setVerticalGroup(
            panelTK5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTK4Layout = new javax.swing.GroupLayout(panelTK4);
        panelTK4.setLayout(panelTK4Layout);
        panelTK4Layout.setHorizontalGroup(
            panelTK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        panelTK4Layout.setVerticalGroup(
            panelTK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTK3Layout = new javax.swing.GroupLayout(panelTK3);
        panelTK3.setLayout(panelTK3Layout);
        panelTK3Layout.setHorizontalGroup(
            panelTK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        panelTK3Layout.setVerticalGroup(
            panelTK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTK2Layout = new javax.swing.GroupLayout(panelTK2);
        panelTK2.setLayout(panelTK2Layout);
        panelTK2Layout.setHorizontalGroup(
            panelTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTK2Layout.setVerticalGroup(
            panelTK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("jLabel17");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(615, 500));

        jLabel2.setText("Từ:");

        jLabel3.setText("Đến:");

        btnThongKe.setText("Thống Kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Thống kê doanh thu:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Thống kê sản phẩm:");

        tblTKSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Lượng bán", "Lượng tồn", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tblTKSP);

        jLabel6.setText("Từ ngày:");

        jLabel7.setText("Đến ngày:");

        jLabel8.setText("Danh mục:");

        jLabel9.setText("Trạng thái:");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Out of stock" }));

        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        panelTK9.setColor1(new java.awt.Color(142, 142, 250));
        panelTK9.setColor2(new java.awt.Color(123, 123, 245));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("THEO NGÀY");

        lbTheoNgay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTheoNgay.setForeground(new java.awt.Color(255, 255, 255));
        lbTheoNgay.setText("10.000 đ");

        javax.swing.GroupLayout panelTK9Layout = new javax.swing.GroupLayout(panelTK9);
        panelTK9.setLayout(panelTK9Layout);
        panelTK9Layout.setHorizontalGroup(
            panelTK9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTK9Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelTK9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTK9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbTheoNgay))
                    .addComponent(jLabel10))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelTK9Layout.setVerticalGroup(
            panelTK9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTK9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTheoNgay)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel6.add(panelTK9);

        panelTK8.setColor1(new java.awt.Color(168, 123, 247));
        panelTK8.setColor2(new java.awt.Color(167, 94, 236));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("THEO THÁNG");

        lbTheoThang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTheoThang.setForeground(new java.awt.Color(255, 255, 255));
        lbTheoThang.setText("10.000 đ");

        javax.swing.GroupLayout panelTK8Layout = new javax.swing.GroupLayout(panelTK8);
        panelTK8.setLayout(panelTK8Layout);
        panelTK8Layout.setHorizontalGroup(
            panelTK8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTK8Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbTheoThang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTK8Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(33, 33, 33))
        );
        panelTK8Layout.setVerticalGroup(
            panelTK8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTK8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTheoThang)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel6.add(panelTK8);

        panelTK7.setColor1(new java.awt.Color(241, 208, 62));
        panelTK7.setColor2(new java.awt.Color(211, 184, 61));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("THEO NĂM");

        lbTheoNam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTheoNam.setForeground(new java.awt.Color(255, 255, 255));
        lbTheoNam.setText("10.000 đ");

        javax.swing.GroupLayout panelTK7Layout = new javax.swing.GroupLayout(panelTK7);
        panelTK7.setLayout(panelTK7Layout);
        panelTK7Layout.setHorizontalGroup(
            panelTK7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTK7Layout.createSequentialGroup()
                .addGroup(panelTK7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTK7Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbTheoNam))
                    .addGroup(panelTK7Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel14)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelTK7Layout.setVerticalGroup(
            panelTK7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTK7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTheoNam)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel6.add(panelTK7);

        panelTK6.setColor1(new java.awt.Color(80, 141, 105));
        panelTK6.setColor2(new java.awt.Color(154, 222, 123));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TÙY CHỌN");

        lbTuyChon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTuyChon.setForeground(new java.awt.Color(255, 255, 255));
        lbTuyChon.setText("0 $");

        javax.swing.GroupLayout panelTK6Layout = new javax.swing.GroupLayout(panelTK6);
        panelTK6.setLayout(panelTK6Layout);
        panelTK6Layout.setHorizontalGroup(
            panelTK6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTK6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel16)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTK6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTuyChon)
                .addGap(53, 53, 53))
        );
        panelTK6Layout.setVerticalGroup(
            panelTK6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTK6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTuyChon)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel6.add(panelTK6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnLoc)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(dcDenNgay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(dcTuNgay2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dcTuNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dcDenNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnThongKe))
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(btnThongKe)
                            .addComponent(dcTuNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dcDenNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(dcTuNgay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(dcDenNgay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(btnLoc)))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        this.tuyChon();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        // TODO add your handling code here:
        this.locSanPham();
    }//GEN-LAST:event_btnLocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JComboBox<String> cboDanhMuc;
    private javax.swing.JComboBox<String> cboTrangThai;
    private com.toedter.calendar.JDateChooser dcDenNgay1;
    private com.toedter.calendar.JDateChooser dcDenNgay2;
    private com.toedter.calendar.JDateChooser dcTuNgay1;
    private com.toedter.calendar.JDateChooser dcTuNgay2;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTheoNam;
    private javax.swing.JLabel lbTheoNgay;
    private javax.swing.JLabel lbTheoThang;
    private javax.swing.JLabel lbTuyChon;
    private view.PanelTK panelTK1;
    private view.PanelTK panelTK2;
    private view.PanelTK panelTK3;
    private view.PanelTK panelTK4;
    private view.PanelTK panelTK5;
    private view.PanelTK panelTK6;
    private view.PanelTK panelTK7;
    private view.PanelTK panelTK8;
    private view.PanelTK panelTK9;
    private javax.swing.JTable tblTKSP;
    // End of variables declaration//GEN-END:variables

    private void locSanPham() {
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        String tuNgay = dcn.format(dcTuNgay2.getDate());
        String denNgay = dcn.format(dcDenNgay2.getDate());
        String danhMuc = cboDanhMuc.getSelectedItem() + "";
        String trangThai = cboTrangThai.getSelectedItem()+"";
        
        DefaultTableModel model = (DefaultTableModel) tblTKSP.getModel();
        model.setRowCount(0);
        for (ThongKeSanPham tksp : thongKeService.locSanPham(tuNgay, denNgay, danhMuc, trangThai)) {
            model.addRow(tksp.toDataRow());
        }
    }
}
