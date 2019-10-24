/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function encripte(fieldobj)
{
       if(fieldobj.value=="")
           return false;
       var p1 =  GM(GM(GM(fieldobj.value)));
       fieldobj.value= p1;
       return true;
}

function encripte1(fieldobj,salt)
{
       var p1 =  GM(GM(GM(fieldobj.value)));
       p1=p1+salt;
       p1 =GM(GM(GM(p1)));
       fieldobj.value= p1;
       return true;
}




