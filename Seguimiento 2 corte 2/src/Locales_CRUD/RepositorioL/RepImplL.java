package Locales_CRUD.RepositorioL;
import Locales_CRUD.ModeloL.Local;

import java.util.ArrayList;
import java.util.List;

public class RepImplL implements RepL {

    private List<Local> locals;

    public RepImplL(){
        locals = new ArrayList<>();
    }

    @Override
    public Local findByNum(int localNum) {
        return locals.stream()
                .filter(local -> local.getLocalNum() == localNum)
                .findFirst()
                .orElse(null);

    }

    @Override
    public List<Local> findAll() {
        return locals;
    }

    @Override
    public void save(Local local) { locals.add(local);

    }

    @Override
    public void update(Local local) {
        Local oldLocal = findByNum(local.getLocalNum());
        if (oldLocal != null){
            locals.remove(oldLocal);
            locals.add(local);
        }

    }

    @Override
    public void delete(Local local) {locals.remove(local);

    }
}
