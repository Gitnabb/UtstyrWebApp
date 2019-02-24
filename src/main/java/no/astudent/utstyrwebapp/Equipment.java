package no.astudent.utstyrwebapp;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

@NoArgsConstructor // Creates class with no constructor
@Data // Creates getters and setters
@Entity
public class Equipment {

    @Id
    @GeneratedValue
    private long equipmentId;
    private String equipmentName;
    private int borrowTime;
    private Date borrowDate;
    private Date returnDate;


    public long getRemainingBorrowTime() {
        LocalDate localDateBorrowDate = getBorrowDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localDateReturnDate = getReturnDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        return DAYS.between(localDateBorrowDate, localDateReturnDate);
    }

}
