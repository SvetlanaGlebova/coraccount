package org.springframework.entityes;
import jakarta.persistence.*;
@Entity
@Table(name = "account")
public class Account {
    @Id
    private String bic;
    private String corraccount;

    public Account() {
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getCorraccount() {
        return corraccount;
    }

    public void setCorraccount(String corraccount) {
        this.corraccount = corraccount;
    }
}
