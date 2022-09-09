import java.io.Serializable;
import java.util.Date;

public class Data implements Serializable {

    private Date data = new Date();

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
