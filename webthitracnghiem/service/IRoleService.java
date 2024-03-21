package com.tttn.webthitracnghiem.service;

import com.tttn.webthitracnghiem.entity.Role;

public interface IRoleService {
    Role findByName(String roleName);
}
