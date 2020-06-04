function myContect() 
{
	alert("calling 9532434286");
}

function sinUp() 
{
	window.open("signUp.html");
}

function Login() 
{
	window.open("login.html");
}
function address() 
{
	window.open("htmlFile/Address.html");
}
function priceDetail() 
{
	window.open("htmlFile/priceDetail.html");
}

function openNav() 
{
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() 
{
    document.getElementById("mySidenav").style.width = "0";
}

function checkSeat() 
{
	window.open("html File/seatAvailability.html");
}
function Book()
{
  window.open("instantBooking.html")
}

function search() 
{
   var y=document.getElementById("searchPlace").value;
    if(y=="Prayagraj" || y=="prayagraj")
      {
         alert("Prayagraj");
      }
      else
        {
          if(y=="Ballia" || y=="ballia")
            {
              window.open("iter_pro.html");
            }
          else
            {
              if (y=="Varanasi" || y=="varanasi") 
              {
                window.open("iter_pro.html");
              }
              else
              {
                alert("this place in not in out bucket");
              }
            }
        }
}

