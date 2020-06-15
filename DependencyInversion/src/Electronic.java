public class Electronic implements Product{

    String serialNo;

    Electronic(String serialNo){
        this.serialNo = serialNo;
    }

    @Override
    public String getBill(){
        return serialNo + " electorincs product has been ordered";
    }

    @Override
    public void order() {
        System.out.println(getBill());
    }
}
