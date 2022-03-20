package suncode.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class TabelaTestowa {
    @Id
    private Long id;
    private String kolumna1;
    private String kolumna2;
    private String kolumna3;
    private Long kolumna4;
}
