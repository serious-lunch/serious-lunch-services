SET NAMES utf8mb4 ;
SET character_set_client = utf8mb4 ;

CREATE TABLE `accounts` (
                            `account_id` bigint(20) NOT NULL AUTO_INCREMENT,
                            `account_name` varchar(50) COLLATE utf8mb4_bin NOT NULL,
                            `email_address` varchar(255) COLLATE utf8mb4_bin NOT NULL,
                            `password_digest` varchar(255) COLLATE utf8mb4_bin NOT NULL,
                            `created_at` datetime NOT NULL,
                            `updated_at` datetime NOT NULL,
                            PRIMARY KEY (`account_id`),
                            UNIQUE KEY `index_accounts_on_account_name` (`account_name`),
                            UNIQUE KEY `index_accounts_on_email_address` (`email_address`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE `account_activations` (
                                       `account_id` bigint(20) NOT NULL,
                                       `activation_digest` varchar(255) COLLATE utf8mb4_bin NOT NULL,
                                       `activated` tinyint(1) NOT NULL DEFAULT '0',
                                       `created_at` datetime NOT NULL,
                                       `updated_at` datetime NOT NULL,
                                       UNIQUE KEY `index_account_activations_on_account_id` (`account_id`),
                                       KEY `index_account_activations_on_activated` (`activated`),
                                       CONSTRAINT `fk_rails_d7d52ac162` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE `account_cookies` (
                                   `account_id` bigint(20) NOT NULL,
                                   `remember_digest` varchar(255) COLLATE utf8mb4_bin NOT NULL,
                                   `created_at` datetime NOT NULL,
                                   `updated_at` datetime NOT NULL,
                                   UNIQUE KEY `index_account_cookies_on_account_id` (`account_id`),
                                   CONSTRAINT `fk_rails_a09f491abe` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE `account_relationships` (
                                         `account_relationship_id` bigint(20) NOT NULL AUTO_INCREMENT,
                                         `follower_account_id` bigint(20) NOT NULL,
                                         `followed_account_id` bigint(20) NOT NULL,
                                         `created_at` datetime NOT NULL,
                                         `updated_at` datetime NOT NULL,
                                         PRIMARY KEY (`account_relationship_id`),
                                         UNIQUE KEY `index_account_relationships_on_follower_and_followed` (`follower_account_id`,`followed_account_id`),
                                         UNIQUE KEY `index_account_relationships_on_followed_and_follower` (`followed_account_id`,`follower_account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE `account_resets` (
                                  `account_id` bigint(20) NOT NULL,
                                  `reset_digest` varchar(255) COLLATE utf8mb4_bin NOT NULL,
                                  `created_at` datetime NOT NULL,
                                  `updated_at` datetime NOT NULL,
                                  UNIQUE KEY `index_account_resets_on_account_id` (`account_id`),
                                  CONSTRAINT `fk_rails_7312fec1e5` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE `lunches` (
                           `lunch_id` bigint(20) NOT NULL AUTO_INCREMENT,
                           `account_id` bigint(20) NOT NULL,
                           `lunch_date` date NOT NULL,
                           `comment` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
                           `created_at` datetime NOT NULL,
                           `updated_at` datetime NOT NULL,
                           PRIMARY KEY (`lunch_id`),
                           KEY `index_lunches_on_account_id_and_lunch_date` (`account_id`,`lunch_date`),
                           KEY `index_lunches_on_account_id_and_created_at` (`account_id`,`created_at`),
                           CONSTRAINT `fk_rails_38eef2a231` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
