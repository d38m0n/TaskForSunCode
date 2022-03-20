package suncode.service;

import org.springframework.stereotype.Service;
import suncode.repository.TableRepository;

import java.util.List;

@Service
public class TableService {

    private TableRepository tableRepository;

    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public List findDuplicateInColumn(int numberOfColumn) {
        switch (numberOfColumn) {
            case 1:
                return tableRepository.findDuplicateInColumn1();

            case 2:
                return tableRepository.findDuplicateInColumn2();

            case 3:
                return tableRepository.findDuplicateInColumn3();

            case 4:
                return tableRepository.findDuplicateInColumn4();
            case 11:
                return tableRepository.findUniqueInColumn1();

            case 22:
                return tableRepository.findUniqueInColumn2();

            case 33:
                return tableRepository.findUniqueInColumn3();

            case 44:
                return tableRepository.findUniqueInColumn4();
            default:
                return tableRepository.findAll();
        }

    }

}
