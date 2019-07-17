DROP TABLE IF EXISTS app_order;
CREATE TABLE app_order (
  id   VARCHAR2(64 CHAR) NOT NULL,
  name VARCHAR2(128 CHAR),
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS order_item;
CREATE TABLE order_item (
  id       VARCHAR2(64 CHAR) NOT NULL,
  name     VARCHAR2(128 CHAR),
  order_id VARCHAR2(64 CHAR) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_odr_itm_odr_id FOREIGN KEY (order_id) REFERENCES app_order (id)
);