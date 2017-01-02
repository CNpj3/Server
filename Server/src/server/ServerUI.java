/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultCaret;
import static jdk.internal.util.xml.impl.Parser.EOS;

/**
 *
 * @author user
 */
public class ServerUI extends javax.swing.JFrame {

    /**
     * Creates new form ServerUI
     */
    Map<String,String> user_pass = new HashMap<String,String>();
    Map<String,Boolean> user_status = new HashMap<String,Boolean>();
    Map<String,Socket> user_socket = new HashMap<String,Socket>();
    PrintWriter user_pass_edit;

    public ServerUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jSplitPane1 = new javax.swing.JSplitPane();
        jFrame2 = new javax.swing.JFrame();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jFrame5 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        server_start_button = new javax.swing.JButton();
        port_num = new javax.swing.JTextField();
        port = new javax.swing.JLabel();
        online_user_label = new java.awt.Label();
        refresh = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        online_user_plane = new javax.swing.JTextArea();
        clear_board = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
        jFrame5.getContentPane().setLayout(jFrame5Layout);
        jFrame5Layout.setHorizontalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame5Layout.setVerticalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CN Line Server");
        setLocationByPlatform(true);
        setResizable(false);

        screen.setEditable(false);
        screen.setColumns(20);
        screen.setRows(5);
        screen.setFocusable(false);
        jScrollPane1.setViewportView(screen);

        server_start_button.setText("server start");
        server_start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                server_start_buttonActionPerformed(evt);
            }
        });

        port_num.setText("2222");

        port.setText("port");

        online_user_label.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        online_user_label.setText("Online Users");

        refresh.setLabel("refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        online_user_plane.setEditable(false);
        online_user_plane.setColumns(20);
        online_user_plane.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        online_user_plane.setRows(5);
        online_user_plane.setText("(none)");
        online_user_plane.setAutoscrolls(false);
        online_user_plane.setFocusable(false);
        jScrollPane3.setViewportView(online_user_plane);

        clear_board.setText("clear");
        clear_board.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_boardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(port)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(port_num, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(server_start_button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear_board, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(online_user_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(online_user_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(port)
                        .addComponent(port_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(server_start_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear_board, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class Server implements Runnable{
        @Override
        public void run() {
            try {
                
                DefaultCaret caret = (DefaultCaret) screen.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                int num = Integer.parseInt(port_num.getText());
                ServerSocket ssock = new ServerSocket(num);
                screen.append("server now listen on port "+num+"\n");
                while(true){
                    Socket listen = ssock.accept();
                    //PrintWriter writer = new PrintWriter(listen.getOutputStream());
                    //todo: add writer to list
                    Thread listener = new Thread(new Handler(listen));
                    listener.start();
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Server Failed.");
                System.exit(0);
            }            
        }
    }
    
    public class Handler implements Runnable{
        Socket client;
        BufferedReader reader;
        PrintWriter writer;

        String user = "";
        String pass = "";

        public Handler(Socket in) throws IOException{
            client = in;
            InputStreamReader isReader = new InputStreamReader(client.getInputStream());
            reader = new BufferedReader(isReader);
            writer = new PrintWriter(client.getOutputStream());
            writer.flush();
        }
        @Override
        public void run(){
            try {
                String[] data;
                String op;
                String select_user = "";
                screen.append("one client connected\n");
                while((op = reader.readLine()) != null){
                    screen.append("recv op: "+op+"\n" );
                    if(op.equals("LOG")){
                        user = reader.readLine();
                        pass = reader.readLine();
                        
                        //if(user.equals("user") && pass.equals("pass")){
                        if(login_verify(user,pass) && (!user_status.get(user))){
                            writer.println("ok");
                            writer.flush();
                            user_status.put(user,true);
                            user_socket.put(user,client);
                            
                        }                        
                        else {
                            writer.println("fail");
                            writer.flush();
                            user = "";
                            pass = "";
                        }
                        
                    }
                    else if (op.equals("REG")) {                        
                        user = reader.readLine();
                        pass = reader.readLine();
                        if(user_pass.containsKey(user)) writer.println("fail");
                        else{
                            user_pass.put(user,pass);
                            user_status.put(user,true);
                            writer.println("ok");
                            //user_pass_edit.println("");
                            user_pass_edit.println(user+" "+pass);
                            user_pass_edit.flush();                            
                            send_UL_to_all();
                            user_socket.put(user,client);                            
                            File myprofile = new File("./data/user/"+user);
                            myprofile.mkdirs();
                        }
                        writer.flush();                       
                    }
                    else if (op.equals("DIS")) {
                        user_status.put(user,false);
                        break;
                    }
                    else if(op.equals("UL")){
                        send_UL(writer);
                    }
                    else if(op.equals("OUSER")){
                        send_OUSER(writer);
                    }
                    else if(op.equals("SEL")){
                        select_user = reader.readLine();
                        screen.append("select_user = "+ select_user+"\n");
                        String status;
                        if(user_status.get(select_user))status = "online";
                        else status = "offline";
                        screen.append("status = " +status+"\n");
                        writer.println("STATUS");
                        writer.println(status);
                        writer.flush();
                        send_old_message(user, select_user, writer);
                    }
                    else if(op.equals("TEXT")){
                        String message = reader.readLine();
                        send_message(user,select_user,message);                        
                    }
                    else if(op.equals("FILEREQ")){
                        op = reader.readLine();
                        screen.append("file: "+op+"\n"+user+" ==> "+select_user+"\n");
                        PrintWriter freq = new PrintWriter(user_socket.get(select_user).getOutputStream());
                        send_protocol(user,op,freq,"FILEREQ");
                    }
                    else if (op.equals("FILERES")) {
                        String filesender = reader.readLine();
                        op = reader.readLine();
                        screen.append(op+" (by "+user+")"+", "+filesender+" ==> "+user+"\n");
                        PrintWriter fres = new PrintWriter(user_socket.get(filesender).getOutputStream());
                        send_protocol(op,"",fres,"FILERES");
                    }
                    else if(op.equals("FILESEND")){
                        String filename = reader.readLine();
                        String len = reader.readLine();
                        PrintWriter fsend = new PrintWriter(user_socket.get(select_user).getOutputStream());
                        send_protocol(filename,len,fsend,"FILESEND");
                        //transfer_file(user,select_user);
                        ////

                        screen.append("filename:"+filename+",before transmission...\n");
                        if(user_status.get(select_user)){
                            byte[] buffer = new byte[1024];
                            DataOutputStream dos = null;
                            DataInputStream dis = null;
                            int part = 0 ;
                            dos = new DataOutputStream(user_socket.get(select_user).getOutputStream());
                            dis = new DataInputStream(client.getInputStream());
                            int length = Integer.parseInt(len);
                            int current =0;
                            while ((current = dis.read(buffer)) != -1 ) {                    
                                dos.write(buffer);
                                part+=current;
                                //screen.append(part+" bytes transfer..."+length+"\n");
                                if(length <= part) break;
                            }
                            screen.append(part+" bytes transfer...\n");
                            //dos.flush();
                            //dos.close();
                            //screen.append("out of while\n");
                            //dis.close();
                            //dos.write(EOS);
                            //screen.append("closed\n");
                        }
                        else send_message("",user,"User->< "+ select_user +" ><- is current offline. File transfer failed.");

                        //////
                    }
                }
            } catch (IOException ex) {
                if(user_status.containsKey(user)){
                    user_status.put(user,false);
                }
                //Logger.getLogger(ServerUI.class.getName()).log(Level.SEVERE, null, ex);
            }            
            screen.append("lost a connection\n");
        }
        private boolean login_verify(String user, String pass){
            return (pass.equals(user_pass.get(user)));
        }        
    }
    public void send_protocol(String message1, String message2, PrintWriter wr,String protocol){
        wr.println(protocol);
        if(!message1.equals("")) wr.println(message1);
        if(!message2.equals("")) wr.println(message2);
        wr.flush();
    }
    public void transfer_file(String send, String receive) throws IOException{
        if(user_status.get(receive)){
            byte[] buffer = new byte[1024];
            DataOutputStream dos = null;
            DataInputStream dis = null;
            dos = new DataOutputStream(user_socket.get(receive).getOutputStream());
            dis = new DataInputStream(user_socket.get(send).getInputStream());
            while (dis.read(buffer) > 0) {
                dos.write(buffer);
            }
            dos.write(null);
            dos.close();
            dis.close();

        }
        else send_message("",send,"User->< "+ receive +" ><- is current offline. File transfer failed.");
    }
    public void message_storage(String send, String receive, String message) throws IOException{
        if(send.equals("")) return;
        File sender_path = new File("./data/user/"+send+"/"+receive+".txt");
        File receiver_path = new File("./data/user/"+receive+"/"+send+".txt");
        PrintWriter sender = new PrintWriter(new BufferedWriter(new FileWriter(sender_path,true)));
        PrintWriter receiver = new PrintWriter(new BufferedWriter(new FileWriter(receiver_path,true)));
        sender.println(send+": "+message);
        sender.flush();
        sender.close();
        receiver.println(send+": "+message);
        receiver.flush();
        receiver.close();
    }
    public void send_message(String send, String receive, String message) throws IOException{
        message_storage(send,receive,message);
        if(user_status.get(receive)){
            PrintWriter wr = new PrintWriter(user_socket.get(receive).getOutputStream()); 
            wr.println("MES");
            wr.println(send);
            wr.println(send+": "+message);
            wr.flush();            
        }
    }
    public void send_old_message(String host, String query, PrintWriter wr) throws IOException{
        File yourFile = new File("./data/user/"+host+"/"+query+".txt");
        //String[] parts;
        yourFile.createNewFile(); 
        BufferedReader br = new BufferedReader(new FileReader(yourFile));
        wr.println("OLD");
        wr.flush();
        for(String line; (line = br.readLine()) != null; ) {
            // process the line.
            //parts = line.split(" ");
            wr.println(line);
        }
        wr.println("\0");
        wr.flush();
        br.close();
    }
    public void send_OUSER(PrintWriter wr){
        wr.println("OUSER");
        for(Map.Entry<String,Boolean> entry: user_status.entrySet()){
            if(entry.getValue()) 
                wr.println(entry.getKey());
        }
        wr.println("\0");
        wr.flush();
    }
    public void send_UL_to_all() throws IOException{
        for(Map.Entry<String,Socket> entry: user_socket.entrySet()){
            PrintWriter wr = new PrintWriter(entry.getValue().getOutputStream());
            send_UL(wr);
        }
    }
    public void send_UL(PrintWriter wr){
        wr.println("UL");
        wr.println(user_status.size());
        for(Map.Entry<String,Boolean> entry: user_status.entrySet()){
            wr.println(entry.getKey());
        }
        wr.flush();
    }
    public void read_login_file() throws IOException{
        File yourFile = new File("./data/login.txt");
        String[] parts;
        yourFile.createNewFile(); // if file already exists will do nothing 
        BufferedReader br = new BufferedReader(new FileReader(yourFile));
        for(String line; (line = br.readLine()) != null; ) {
            // process the line.
            parts = line.split(" ");
            user_pass.put(parts[0],parts[1]);
            screen.append("user:"+parts[0]+",pass:"+ user_pass.get(parts[0])+"\n");
        }
        user_pass_edit = new PrintWriter(new BufferedWriter(new FileWriter(yourFile,true)));
    // line is not visible here.
    }
    public void setup_user_status(){
        for(Map.Entry<String,String> entry: user_pass.entrySet()){
            user_status.put(entry.getKey(),false);
        }
    }
    
    private void server_start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_server_start_buttonActionPerformed
        try {
            read_login_file();
            setup_user_status();
        } catch (IOException ex) {
            Logger.getLogger(ServerUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        Thread serv = new Thread(new Server());
        serv.start();
        server_start_button.setEnabled(false);
    }//GEN-LAST:event_server_start_buttonActionPerformed
    
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        online_user_plane.setText("");
        boolean none = true;
        for(Map.Entry<String,Boolean> entry: user_status.entrySet()){
            if(entry.getValue()){
                none = false;
                online_user_plane.append(entry.getKey()+"\n");
            }
        }
        if(none) online_user_plane.setText("(none)");
    }//GEN-LAST:event_refreshActionPerformed

    private void clear_boardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_boardActionPerformed
        // TODO add your handling code here:
        screen.setText("");
    }//GEN-LAST:event_clear_boardActionPerformed

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
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_board;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private java.awt.Label online_user_label;
    private javax.swing.JTextArea online_user_plane;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private javax.swing.JLabel port;
    private javax.swing.JTextField port_num;
    private java.awt.Button refresh;
    private javax.swing.JTextArea screen;
    private javax.swing.JButton server_start_button;
    // End of variables declaration//GEN-END:variables
}
