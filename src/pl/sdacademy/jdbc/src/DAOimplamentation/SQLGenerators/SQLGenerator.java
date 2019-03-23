package pl.sdacademy.jdbc.src.DAOimplamentation.SQLGenerators;

import DAOimplamentation.Entities.Entiti;

public interface SQLGenerator<T extends Entiti> {
    String insert(T toInsert);
    String selectALL();
    String update(T toUpdate);
    String delete(T toDelete);
}
