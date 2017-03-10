<%-- 
    Document   : notify
    Created on : Mar 10, 2017, 7:47:50 PM
    Author     : MotYim
--%>
<c:if test="${not empty AlertMessage}">
    <script>showNotification('${AlertMessage}','${AlertType}');</script>
    <c:remove var="AlertMessage" scope="session" />
</c:if>