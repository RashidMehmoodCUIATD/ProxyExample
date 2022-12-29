public class ConfigManager {
    String dbconnection;
    String adminEmailID;
    String URL;
    String port;

    String getDbconnection(){
        return dbconnection;

    }
    String getAdminEmailID(){
        return adminEmailID;
    }

    String getURL(){
        return URL;
    }
    String getPort(){
        return port;
    }

    void setDbconnection(String dbConnectionParams){
        this.dbconnection=dbConnectionParams;
    }
    void  setURL(String urlToSet){
        this.URL=urlToSet;
    }
    void setAdminEmailID(String newAdminEmail){
        this.adminEmailID=newAdminEmail;

    }
    void setPort(String porttoSet){
        this.port=porttoSet;
    }





}
