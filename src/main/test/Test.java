import com.dao.impl.DeptDaoImpl;
import com.entity.Dept;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        Dept dept = new Dept();
        DeptDaoImpl deptDao = new DeptDaoImpl();
        List<Dept> list = deptDao.findAll(dept);
        for (Dept city2 : list) {
            System.out.println(city2);
        }
    }
}
