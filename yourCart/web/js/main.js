/*scroll to top*/

$(document).ready(function () {
    $(function () {
        $.scrollUp({
            scrollName: 'scrollUp', // Element ID
            scrollDistance: 300, // Distance from top/bottom before showing element (px)
            scrollFrom: 'top', // 'top' or 'bottom'
            scrollSpeed: 300, // Speed back to top (ms)
            easingType: 'linear', // Scroll to top easing (see http://easings.net/)
            animation: 'fade', // Fade, slide, none
            animationSpeed: 200, // Animation in speed (ms)
            scrollTrigger: false, // Set a custom triggering element. Can be an HTML string or jQuery object
            //scrollTarget: false, // Set a custom target element for scrolling to the top
            scrollText: '<i class="fa fa-angle-up"></i>', // Text for element, can contain HTML
            scrollTitle: false, // Set a custom <a> title if required.
            scrollImg: false, // Set true to use image
            activeOverlay: false, // Set CSS color to display scrollUp active point, e.g '#00FFFF'
            zIndex: 2147483647 // Z-Index for the overlay
        });
    });

    //to read photo from client 
    function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#imageView').attr('src', e.target.result);
            }

            reader.readAsDataURL(input.files[0]);
        }
    }

    //add listner
    $("#image").change(function () {
        readURL(this);
    });
    
   //change active class
    activeClass();
    
});

/*price range*/

 $('#sl2').slider();

	var RGBChange = function() {
	  $('#RGB').css('background', 'rgb('+r.getValue()+','+g.getValue()+','+b.getValue()+')')
};

 //change class active 
    function activeClass(){
        var link = window.location.href;
        if(link.includes("Shop")){
            $("#shopBtn").addClass("active");
            $("#homeBtn").removeClass("active");
        }else if(link.includes("index.jsp") || link.endsWith("yourCart/")){
            $("#homeBtn").addClass("active");
            $("#shopBtn").removeClass("active");
        }else{
            $("#homeBtn").removeClass("active");
            $("#shopBtn").removeClass("active");
        }
    }
