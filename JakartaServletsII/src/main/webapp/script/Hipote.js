function comprobarnum ()
{
    let cata = document.getElementById("catetoa").value;
    
    let catb = document.getElementById("catetob").value;
    

    
  if (cata != "" && catb != "")
{
    if (catA == parseFloat(cata) && catB == parseFloat(catb))
    {
        return true;
    }
    else
    {
        alert("Ingrese un numero");
        return false;
    }
    }
    else
    {
    alert("Rellene todos los campos ");
    return false;
    }
}
        
    
   



