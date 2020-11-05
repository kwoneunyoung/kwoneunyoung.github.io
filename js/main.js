$(document).ready(function(){    

  $(".accordion-list > li.active .answer").slideDown();
 
    
    $('.accordion-list > li').click(function() {
      if ($(this).hasClass("active")) {
        $(this).removeClass("active").find(".answer").slideUp();
      } else if ($(".accordion-list > li.active .answer").slideUp()){
        
        $(".accordion-list > li.active").removeClass("active");
        $(this).addClass("active").find(".answer").slideDown();
      }
      return false;
    });
    

   
   

  });