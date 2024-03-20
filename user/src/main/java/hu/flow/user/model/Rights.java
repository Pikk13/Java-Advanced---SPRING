package hu.flow.user.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum Rights {
  @Enumerated (EnumType.STRING) USER, @Enumerated(EnumType.STRING)  ADMIN, @Enumerated(EnumType.STRING)  SUPERADMIN;


}




