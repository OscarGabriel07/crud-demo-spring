# crud-demo-spring
Modificación de usuario: 
Este usuario tenía como nombre Oscar y se actualizó a Oscar Gabriel.

![image](https://user-images.githubusercontent.com/97564825/172760667-5751cb88-6bf0-4f3f-bb7f-dae2da6b392e.png)

Este usuario tenía de correo yeison@mail.com y se actualizó a yeisonale@mail.com.

![image](https://user-images.githubusercontent.com/97564825/172760701-71078da6-ca49-41ea-b362-f6dffe14d666.png)
 
En la clase UsuarioModel se hace la relación de @OneToMany y en la clase de RolUsuarioModel de @ManyToOne dado que un usuario puede tener varios roles. Se crea el Repositorio para RolUsuario, así como el servicio y el controlador.
 
![image](https://user-images.githubusercontent.com/97564825/172760720-3841806e-4be1-4adb-98ff-d1ed05fd6de9.png) 
 
Intenté realizar un Test, pero me sale el siguiente error:

![image](https://user-images.githubusercontent.com/97564825/172760728-a1619522-cb41-41db-afc0-97a649ae00cf.png)
