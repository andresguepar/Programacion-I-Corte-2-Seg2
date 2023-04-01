package Locales_CRUD.RepositorioL;

import Locales_CRUD.ModeloL.Local;

import java.util.List;

public interface RepL {
    Local findByNum(int localNum);
    List<Local> findAll();
    void save(Local local);
    void update(Local local);
    void  delete(Local local);
}
