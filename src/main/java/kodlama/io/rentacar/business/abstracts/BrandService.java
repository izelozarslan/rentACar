package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BrandService {
    List<Brand> getAll();
}
