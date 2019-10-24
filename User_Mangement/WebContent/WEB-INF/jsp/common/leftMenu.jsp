<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="navbar-default sidebar" role="navigation">
<div class="sidebar-nav navbar-default" id="menu1"></div>
</div>

<script src="<c:url value="/resources/js/menu.js"/>"></script>
<script type="text/javascript">
buildMenu('menu1',eval('${links}'));
</script>
<script src="<c:url value="/resources/js/sb-admin-2.js"/>"></script>

