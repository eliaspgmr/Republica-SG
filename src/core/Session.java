/**
 * Classe de Sessao do usuáario
 * @author Hover-Inc
 */
package core;

public class Session {
    
    //Variables
    private static String user;
    private static String server;
    private static String gate;
    private static String serverUser;
    private static String userNome;
    
    public static void close(){
        user = null;
        server = null;
        gate = null;
        serverUser = null;
        userNome = null;
    }
    //Setters
    public static void setUser(String user) {
        Session.user = user;
    }
    public static void setServer(String server) {
        Session.server = server;
    }
    public static void setGate(String gate) {
        Session.gate = gate;
    }
    public static void setServerUser(String serverUser){
        Session.serverUser = serverUser;
    }
    public static void setUserNome(String userNome) {
        Session.userNome = userNome;
    }

    //Getters
    public static String getUser() {
        return user;
    }
    public static String getServer() {
        return server;
    }
    public static String getGate() {
        return gate;
    } 
    public static String getServerUser() {
        return serverUser;
    }
    public static String getUserNome() {
        return userNome;
    }  
}
