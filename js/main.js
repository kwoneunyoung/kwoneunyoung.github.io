$(document).ready(function(){
       /* one page scroll */
       var myFullpage = new fullpage('#fullpage', {
        lazyLoad: true,
      onLeave: function(origin, destination, direction){
         var params = { destination:destination };
         if ( params["destination"]["index"] > 0 ){
            $("nav").addClass("fix");
         } else {
            $("nav").removeClass("fix");
         }
      }
    });
    
});