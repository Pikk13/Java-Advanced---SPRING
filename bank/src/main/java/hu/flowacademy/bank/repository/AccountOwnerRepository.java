package hu.flowacademy.bank.repository;

import hu.flowacademy.bank.model.AccountOwner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOwnerRepository extends JpaRepository<AccountOwner, String> {
List<AccountOwner> findByFullName(String fullName);

}
