**API de CRUD de Produtos**

**Recursos:**

* Produtos
* Categorias
* Marcas

**Operações:**

* **Produtos:**
    * `GET /produtos` - Listar todos os produtos
    * `POST /produtos` - Criar um novo produto
    * `PUT /produtos/:id` - Atualizar um produto
    * `DELETE /produtos/:id` - Deletar um produto
* **Categorias:**
    * `GET /categorias` - Listar todas as categorias
    * `POST /categorias` - Criar uma nova categoria
    * `PUT /categorias/:id` - Atualizar uma categoria
    * `DELETE /categorias/:id` - Deletar uma categoria
* **Marcas:**
    * `GET /marcas` - Listar todas as marcas
    * `POST /marcas` - Criar uma nova marca
    * `PUT /marcas/:id` - Atualizar uma marca
    * `DELETE /marcas/:id` - Deletar uma marca

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

**Endpoints de Busca:**

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
