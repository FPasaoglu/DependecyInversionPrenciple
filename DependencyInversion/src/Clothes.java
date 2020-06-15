public class Clothes implements Product{

    String serialNo;

    Clothes(String serialNo){
        this.serialNo = serialNo;
    }

    @Override
    public String getBill(){
        return serialNo + " clothes has been ordered";
    }

    @Override
    public void order() {
        System.out.println(getBill());
    }
}
