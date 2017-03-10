$(document).ready(function () {

    //init number of product for user
    if ("userID" in window)
        getInitProductNumber(userID);

    //add in home & shop page
    $('.add-to-cart').click(function () {
        var id = $(this).attr('id');
        addProduct(id, 1);
    });

    //add from product details
    $('.add-to-my').click(function () {
        var id = $(this).attr('id');
        var qaunty = $("#quan").val();
        addProduct(id, qaunty);
    });

    // add product to cart
    function addProduct(id, qaunty) {
        $.ajax({
            url: 'addCart', //servlet url
            type: 'GET',
            data: {"productID": id, "qaunty": qaunty},
            success: (data) => {
                if (data.redirect) {
                    // data.redirect contains the string URL to redirect to
                    window.location.href = data.redirect;
                }else{
                    $("#number").html(data);
                    showNotification('product add to your cart','success');
                }
                
            },
            error: function (xhr, ajaxOptions, thrownError) {
                alert("error");
                if (thrownError.redirect.length) {
                    window.location.replace(thrownError.redirect);
                } else {
                    alert('There was an error processing your request, please try again');
                }
            }
        });
    }

    function getInitProductNumber(id) {
        $.ajax({
            url: 'getCartCount', //servlet url
            type: 'GET',
            data: {"id": id},
            success: (data) => {
                $("#number").html(data);
            }
        });
    }
    
});