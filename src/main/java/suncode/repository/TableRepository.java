package suncode.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import suncode.model.TabelaTestowa;

import java.util.List;

@Repository
public interface TableRepository extends JpaRepository<TabelaTestowa, Long> {


    @Query(value = "select * from tabela_testowa where kolumna1 in " +
            "( select kolumna1 from tabela_testowa group by kolumna1 having count(*) > 1 )",
            nativeQuery = true)
    List<TabelaTestowa> findDuplicateInColumn1();

    @Query(value = "select * from tabela_testowa where kolumna2 in " +
            "( select kolumna2 from tabela_testowa group by kolumna2 having count(*) > 1 )",
            nativeQuery = true)
    List<TabelaTestowa> findDuplicateInColumn2();

    @Query(value = "select * from tabela_testowa where kolumna3 in " +
            "( select kolumna3 from tabela_testowa group by kolumna3 having count(*) > 1 )",
            nativeQuery = true)
    List<TabelaTestowa> findDuplicateInColumn3();

    @Query(value = "select * from tabela_testowa where kolumna4 in " +
            "( select kolumna4 from tabela_testowa group by kolumna4 having count(*) > 1 )",
            nativeQuery = true)
    List<TabelaTestowa> findDuplicateInColumn4();

    @Query(value = "select * from tabela_testowa where kolumna1 in " +
            "( select kolumna1 from tabela_testowa group by kolumna1 having count(*) = 1 )",
            nativeQuery = true)
    List<TabelaTestowa> findUniqueInColumn1();

    @Query(value = "select * from tabela_testowa where kolumna2 in " +
            "( select kolumna2 from tabela_testowa group by kolumna2 having count(*) = 1 )",
            nativeQuery = true)
    List<TabelaTestowa> findUniqueInColumn2();

    @Query(value = "select * from tabela_testowa where kolumna3 in " +
            "( select kolumna3 from tabela_testowa group by kolumna3 having count(*) = 1 )",
            nativeQuery = true)
    List<TabelaTestowa> findUniqueInColumn3();

    @Query(value = "select * from tabela_testowa where kolumna4 in " +
            "( select kolumna4 from tabela_testowa group by kolumna4 having count(*) = 1 )",
            nativeQuery = true)
    List<TabelaTestowa> findUniqueInColumn4();
}
