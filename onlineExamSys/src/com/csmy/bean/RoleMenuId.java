package com.csmy.bean;



/**
 * RoleMenuId entity. @author MyEclipse Persistence Tools
 */

public class RoleMenuId  implements java.io.Serializable {


    // Fields    

     private Integer roleId;
     private Integer menuId;


    // Constructors

    /** default constructor */
    public RoleMenuId() {
    }

    
    /** full constructor */
    public RoleMenuId(Integer roleId, Integer menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

   
    // Property accessors

    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RoleMenuId) ) return false;
		 RoleMenuId castOther = ( RoleMenuId ) other; 
         
		 return ( (this.getRoleId()==castOther.getRoleId()) || ( this.getRoleId()!=null && castOther.getRoleId()!=null && this.getRoleId().equals(castOther.getRoleId()) ) )
 && ( (this.getMenuId()==castOther.getMenuId()) || ( this.getMenuId()!=null && castOther.getMenuId()!=null && this.getMenuId().equals(castOther.getMenuId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRoleId() == null ? 0 : this.getRoleId().hashCode() );
         result = 37 * result + ( getMenuId() == null ? 0 : this.getMenuId().hashCode() );
         return result;
   }   





}