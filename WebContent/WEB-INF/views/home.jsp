<h1> Welcome to the Spectral Shop</h1>

<c:forEach items="${ products }" var="product">
	<figure>
		<img  src="ressources/imgs/products/${ product.name }.jpg" alt="phone image"/>
		<figcaption>
			<c:url var='loadProductPage' value='product' >
				<c:param name="id" value='${ product.id }'></c:param>
			</c:url>
			 <a href='${ loadProductPage }'>${ product.name }</a>
		</figcaption>
	</figure>

</c:forEach>