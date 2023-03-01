
package agechecker;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileWriter;   
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;

      

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jtxtUsername = new javax.swing.JTextField();
        jbtnLogin = new javax.swing.JButton();
        SaveToFile = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+5f));
        jLabel2.setText("მომხმარებლის სახელი");

        jPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        jtxtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsernameActionPerformed(evt);
            }
        });

        jbtnLogin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtnLogin.setText("Login");
        jbtnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        jbtnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnLoginKeyPressed(evt);
            }
        });

        SaveToFile.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SaveToFile.setText("SAVE");
        SaveToFile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SaveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveToFileActionPerformed(evt);
            }
        });

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getSize()+5f));
        jLabel5.setText("პაროლი");

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+5f));
        jLabel3.setText("ელ-ფოსტა");

        txtmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(SaveToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLogin)
                    .addComponent(SaveToFile))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+11f));
        jLabel4.setText("სარეგისტრაციო ფორმა");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 349, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jtxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsernameActionPerformed
      
    }//GEN-LAST:event_jtxtUsernameActionPerformed
    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
    }//GEN-LAST:event_jPasswordActionPerformed
    private void SaveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveToFileActionPerformed
        
        CreateFile();
               
    }//GEN-LAST:event_SaveToFileActionPerformed
    
   public static boolean isValidEmail(String email) {
       String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
   }
    public void CreateFile() { //ფუნქცია რომელიც ქმნის ფაილს და შექმნილ ფაილში წერს ავტორიზაციის შედეგს. 
        if(txtmail.getText().length()> 0 && jtxtUsername.getText().length()> 0 && jPassword.getText().length()> 0 && isValidEmail(txtmail.getText())) 
        {
                  
            try {
                    FileWriter myWriter = new FileWriter("shedegi.txt");
                    myWriter.write(txtmail.getText()+"\r\n"+jtxtUsername.getText()+"\r\n"+jPassword.getText()+"\r\n");
                    myWriter.close();
                    txtmail.setText(null);
                    jtxtUsername.setText(null);
                    jPassword.setText(null);
                    JOptionPane.showMessageDialog(null,"წარმატებულად შეინახა მონაცემები.", "კაია.",JOptionPane.PLAIN_MESSAGE);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }    
        }
        else{
           JOptionPane.showMessageDialog(null,"შემოუყვანეთ მონაცემები სრულად", "დაფიქსირდა შეცდომა",JOptionPane.ERROR_MESSAGE);  
        }
    }
    
    
    
    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        String password = jPassword.getText();
        String mailadress = txtmail.getText();
        String username = jtxtUsername.getText();
        try  
        {  
            BufferedReader in = new BufferedReader(new FileReader("shedegi.txt"));
            String str;
            List<String> list = new ArrayList<String>();
            while((str = in.readLine()) != null){
                list.add(str);
            }
            
            String[] stringArr = list.toArray(new String[0]);
            if (stringArr.length == 0){
                JOptionPane.showMessageDialog(null,"მონაცემები არ შენახულა. ფაილი ცარიელია.", "დაფიქსირდა შეცდომა",JOptionPane.ERROR_MESSAGE);  
                  return;
                 
            }
       
            if (password.contains(list.get(2)) && (username.contains(list.get(1))) && (mailadress.contains(list.get(0)))) //ვამოწმებთ შეიცავს თუ არა TEXTBOX ები ჩვენს მიერ შენახულ მონაცემებს. რათქმაუდნა CONTAIN მეთოდზე უკეთესი პირდაპირი ტოლობა იქნება მარა მარტივი და ბანალურია 
            {
                txtmail.setText(null);
                jtxtUsername.setText(null);
                jPassword.setText(null);
                systemExit();

                JOptionPane.showMessageDialog(null,"წარმატებული რეგისტრაცია", "კაია.",JOptionPane.PLAIN_MESSAGE);
                txtmail.setText(null);
                jPassword.setText(null);
                jtxtUsername.setText(null);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"არასწორი მონაცემები", "დაფიქსირდა შეცდომა",JOptionPane.ERROR_MESSAGE); //შეცდომის გამოტანა MESSAGEBOX ის სახით.
                jPassword.setText(null); // სალოგინე ფორმის მომხმარებლის TEXTBOX ის გასუფთავება
                jtxtUsername.setText(null); //სალოგინე ფორმის პაროლის TEXTBOX ის გასუფთავება
               
            }
        }   
        catch(IOException e)  
        {  
            e.printStackTrace();  
        }  
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void txtmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmailActionPerformed

    private void jbtnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnLoginKeyPressed
            
    }//GEN-LAST:event_jbtnLoginKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        JFrame frame = new JFrame();
        frame.getRootPane().setDefaultButton(jbtnLogin);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveToFile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JTextField jtxtUsername;
    private javax.swing.JTextField txtmail;
    // End of variables declaration//GEN-END:variables
    
    private void systemExit()
    {
        WindowEvent WinCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING); 
    }
    
    
}
