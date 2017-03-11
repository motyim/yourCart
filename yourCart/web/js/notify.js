function showNotification(messageAlert, typeAlert) {
    $.notify({
        // options
        message: messageAlert
    }, {
        // settings
        type: typeAlert
    });
}