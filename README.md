**API de CRUD de Produtos**

**Recursos:**

* Produtos
* Categorias
* Marcas

**Operações:**

* **Produtos:**
    * `GET /products` - Listar todos os produtos
    * `POST /products` - Criar um novo produto
    * `PUT /products/:id` - Atualizar um produto
    * `DELETE /products/:id` - Deletar um produto
* **Categorias:**
    * `GET /category` - Listar todas as categorias
    * `POST /category` - Criar uma nova categoria
    * `PUT /category/:id` - Atualizar uma categoria
    * `DELETE /category/:id` - Deletar uma categoria
* **Marcas:**
    * `GET /brand` - Listar todas as marcas
    * `POST /brand` - Criar uma nova marca
    * `PUT /brand/:id` - Atualizar uma marca
    * `DELETE /brand/:id` - Deletar uma marca

**Campos dos Produtos:**

* ID
* Nome
* Descrição
* Marca
* preço
* Categoria
* Ativo

**Campos das Categorias:**

* ID
* Nome
* Descrição
* Ativo

**Campos das Marcas:**

* ID
* Nome
* Ativo

**Endpoints**

* **Produtos:**
* `POST /http://localhost:8081/api/product` - Inserir produtos por nome
* `GET http://localhost:8081/api/product - Listar produtos ativos
* `PUT http://localhost:8081/api/product/ - Editar produtos
* `DELETE http://localhost:8081/api/product/{id} - Desativa o produto

* **Categorias:**
* `POST /http://localhost:8081/api/category` - Inserir Categoria por nome
* `GET http://localhost:8081/api/category` - Listar Categoria ativos
* `PUT http://localhost:8081/api/category/{id}` - Editar Categoria
* `DELETE http://localhost:8081/api/category/{id}` - Desativa a Categoria

* **Marcas:**
* `POST /http://localhost:8081/api/brand` - Inserir Categoria por nome
* `GET http://localhost:8081/api/brand` - Listar Categoria ativos
* `PUT http://localhost:8081/api/brand/{id}` - Editar Categoria
* `DELETE http://localhost:8081/api/brand/{id}` - Desativa a Categoria
