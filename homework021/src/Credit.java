public class Credit {
    private int id;
    private double sumCredit;
    private int periodCredit;
    private int rate;
    private static int countCredit;
    private static int totalSumCredits;

    public Credit(){}
    public Credit(int id, double sumCredit, int periodCredit, int rate) {
        this.id = id;
        this.sumCredit = sumCredit;
        this.periodCredit = periodCredit;
        this.rate = rate;
        countCredit++;
        totalSumCredits += sumCredit;
    }

    public int countCredit(int countCredit){
        return this.countCredit;
    }
    public int totalSumCredits(int totalSumCredits){
        return this.totalSumCredits;
    }
    public double averageAmount(int sumCredit, int countCredit){
        return this.totalSumCredits / this.countCredit;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getSumCredit() {
        return sumCredit;
    }
    public void setSumCredit(double sumCredit) {
        this.sumCredit = sumCredit;
    }

    public int getPeriodCredit() {
        return periodCredit;
    }
    public void setPeriodCredit(int periodCredit) {
        this.periodCredit = periodCredit;
    }

    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public static int getCountCredit() {
        return countCredit;
    }
    public static void setCountCredit(int countCredit) {
        Credit.countCredit = countCredit;
    }

    public static int getTotalSumCredits() {
        return totalSumCredits;
    }
    public static void setTotalSumCredits(int totalSumCredits) {
        Credit.totalSumCredits = totalSumCredits;
    }
}
