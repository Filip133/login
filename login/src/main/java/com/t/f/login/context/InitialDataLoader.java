package com.t.f.login.context;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
//import com.t.f.login.entity.Privilege;
//import com.t.f.login.entity.Role;
//import com.t.f.login.entity.User;
//import com.t.f.login.repository.PrivilegeRepository;
//import com.t.f.login.repository.RoleRepository;
//import com.t.f.login.repository.UserRepository;
//
//@Component
public class InitialDataLoader {//implements
//  ApplicationListener<ContextRefreshedEvent> {
// 
//    boolean alreadySetup = false;
// 
//    @Autowired
//    private UserRepository userRepository;
//  
//    @Autowired
//    private RoleRepository roleRepository;
//  
//    @Autowired
//    private PrivilegeRepository privilegeRepository;
//  
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//  
//    @Override
//    @Transactional
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//  
//        if (alreadySetup)
//            return;
//        Privilege readPrivilege
//          = createPrivilegeIfNotFound("READ_PRIVILEGE");
//        Privilege writePrivilege
//          = createPrivilegeIfNotFound("WRITE_PRIVILEGE");
//  
//        List<Privilege> adminPrivileges = Arrays.asList(
//          readPrivilege, writePrivilege);        
//        createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
//        createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));
// 
//        Role adminRole = roleRepository.findByName("ROLE_ADMIN");
//        User user = new User();
//        user.setFirstName("Test");
//        user.setLastName("Test");
//        user.setPassword(passwordEncoder.encode("test"));
//        user.setEmail("test@test.com");
//        user.setRoles(Arrays.asList(adminRole));
//        user.setEnabled(true);
//        userRepository.add(user);
// 
//        alreadySetup = true;
//    }
// 
//    @Transactional
//    private Privilege createPrivilegeIfNotFound(String name) {
//  
//        Privilege privilege = privilegeRepository.findByName(name);
//        if (privilege == null) {
//            privilege = new Privilege(name);
//            privilegeRepository.add(privilege);
//        }
//        return privilege;
//    }
// 
//    @Transactional
//    private Role createRoleIfNotFound(
//      String name, Collection<Privilege> privileges) {
//  
//        Role role = roleRepository.findByName(name);
//        if (role == null) {
//            role = new Role(name);
//            role.setPrivileges(privileges);
//            roleRepository.add(role);
//        }
//        return role;
//    }
}
